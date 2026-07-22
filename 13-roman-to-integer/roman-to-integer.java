class Solution {
    public int romanToInt(String s) {
        int ans = 0;
        HashMap<Character, Integer> hm = new HashMap<>();
        hm.put('I', 1);
        hm.put('V', 5);
        hm.put('X', 10);
        hm.put('L', 50);
        hm.put('C', 100);
        hm.put('D', 500);
        hm.put('M', 1000);

        for (int i = 0; i < s.length(); i++) {
            if (i + 1 < s.length()) {
                if (hm.get(s.charAt(i)) < hm.get(s.charAt(i + 1))) {
                    ans = ans + (hm.get(s.charAt(i + 1)) - hm.get(s.charAt(i)));
                    i++;
                    continue;
                }
            }
            ans = ans + hm.get(s.charAt(i));
        }
        return ans;
    }
}