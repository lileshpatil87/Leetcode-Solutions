class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>> an = new HashSet<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            int num = -nums[i];
            int start = i + 1;
            int end = nums.length - 1;
            while (start < end) {
                int sum = nums[start] + nums[end];
                if (sum == num) {
                    ArrayList<Integer> ls = new ArrayList<>(List.of(nums[i], nums[start], nums[end]));
                    an.add(new ArrayList(ls));
                    start++;
                    end--;
                } else if (sum > num) {
                    end--;
                } else if (sum < num) {
                    start++;
                }
            }
        }
        
        List<List<Integer>> ans = new ArrayList(an);
        return ans;
    }
}