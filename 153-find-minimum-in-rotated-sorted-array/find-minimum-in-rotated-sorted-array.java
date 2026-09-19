class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int min = Integer.MAX_VALUE;
        while (left <= right) {
            int crr = (left + right) / 2;
            min = Math.min(nums[crr], min);
            if (nums[crr] > nums[right]) {
                left = crr + 1;
            } else {
                right = crr - 1;
            }
        }
        return min;
    }
}