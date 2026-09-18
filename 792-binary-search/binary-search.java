class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int crr = (left + right) / 2;
            if (nums[crr] == target) {
                return crr;
            } else if (nums[crr] > target) {
                right = crr - 1;
            } else {
                left = crr + 1;
            }
        }
        return -1;
    }
}