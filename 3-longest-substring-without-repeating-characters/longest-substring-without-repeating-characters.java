class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0;
        int lg = 0;
        HashSet<Character> hs = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (!hs.add(s.charAt(i))) {
                lg = Math.max(i - l, lg);
                while (!hs.add(s.charAt(i))) {
                    hs.remove(s.charAt(l));
                    l++;
                }
            }
        }
        return Math.max(lg, hs.size());
    }
}