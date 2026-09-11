class Solution {
    public int longestValidParentheses(String s) {
        int maxSubStr = 0;
        Deque<Integer> sc = new ArrayDeque<>();
        sc.push(-1);
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                sc.push(i);
            } else {
                sc.pop();
                if (!sc.isEmpty()) {
                    maxSubStr = Math.max(maxSubStr, i - sc.peek());
                } else {
                    sc.push(i);
                }
            }
        }
        return maxSubStr;
    }
}