class Solution {
    public int romanToInt(String s) {
        int roman = 0;
        for (int i = 0; i < s.length(); i++) {
            int j = roman(s.charAt(i));
            if (i + 1 < s.length()) {
                int k = roman(s.charAt(i + 1));
                if (j < k) {
                    roman += (k - j);
                    i++;
                    continue;
                }
            }
            roman += j;
        }
        return roman;

    }

    public int roman(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
        }
        return 1;
    }
}