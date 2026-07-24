class Solution {
    public int firstMissingPositive(int[] nums) {
        int s = 1;
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] > 0 && nums[i] <= nums.length && nums[nums[i] - 1] != nums[i]) {
                int ci = nums[i] - 1;
                int temp = nums[ci];
                nums[ci] = nums[i];
                nums[i] = temp;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }
        return nums.length + 1;

        // int sm = 1;
        // HashSet<Integer> hs = new HashSet<>();
        // for (int i = 0; i < nums.length; i++) {
        //     hs.add(nums[i]);
        // }
        // while(hs.contains(sm)){
        //     sm++;
        // }
        // return sm;
    }
}