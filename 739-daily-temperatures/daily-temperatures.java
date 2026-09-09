class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] ans = new int[temperatures.length];
        Deque<Integer> idx = new ArrayDeque<>();
        for (int i = 0; i < temperatures.length; i++) {

            while (!idx.isEmpty() && temperatures[idx.peek()] < temperatures[i]) {
                ans[idx.peek()] = i - idx.pop();
            }
            idx.push(i);

        }
        return ans;
    }
}