class Solution {
    public String minRemoveToMakeValid(String s) {
        Deque<Integer> de = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < sb.length(); i++) {
            char c = sb.charAt(i);
            if (Character.isLetter(c)) {
                continue;
            }
            if (c == '(') {
                de.push(i);
            } else {
                if (de.isEmpty()) {
                    sb.setCharAt(i,' ');
                } else {
                    de.pop();
                }
            }
        }
        while (!de.isEmpty()) {
            int x = de.pop();
            sb.setCharAt(x, ' ');
        }
        return sb.toString().replace(" ","");
    }
}