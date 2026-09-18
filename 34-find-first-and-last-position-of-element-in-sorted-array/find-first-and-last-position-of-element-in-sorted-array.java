class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        ans[0] = bs(nums, target, true);
        ans[1] = bs(nums, target, false);
        return ans;
    }

    public int bs(int[] nums, int target, boolean firstFound) {
        int left = 0;
        int right = nums.length - 1;
        int res = -1;
        while (left <= right) {
            int crr = (left + right) / 2;
            if (nums[crr] == target) {
                res = crr;
                if (firstFound) {
                    right = crr - 1;
                } else {
                    left = crr + 1;
                }
            } else if (nums[crr] < target) {
                left = crr + 1;
            } else {
                right = crr - 1;
            }
        }
        return res;
    }
}