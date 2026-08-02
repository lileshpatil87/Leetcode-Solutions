class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int num = -nums[i];
            int start = i + 1;
            int end = nums.length - 1;
            while (start < end) {
                int sum = nums[start] + nums[end];
                if (sum == num) {
                    ArrayList<Integer> ls = new ArrayList<>(List.of(nums[i], nums[start], nums[end]));
                    ans.add(new ArrayList(ls));
                    start++;
                    while (start < nums.length && nums[start] == nums[start - 1]) {
                        start++;
                    }
                    end--;
                    while (end >= 0 && nums[end] == nums[end + 1]) {
                        end--;
                    }
                } else if (sum > num) {
                    end--;
                } else if (sum < num) {
                    start++;
                }
            }
        }

        return ans;
    }
}