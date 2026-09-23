class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] ans = new int[temperatures.length];
        Deque<Integer> sc = new ArrayDeque<>();
        for(int i=0;i<temperatures.length;i++){
            if(!sc.isEmpty()){
                while(!sc.isEmpty() && temperatures[sc.peek()] < temperatures[i]){
                    ans[sc.peek()] = i - sc.pop();
                }
            }
            sc.push(i);
        }
        return ans;
    }
}