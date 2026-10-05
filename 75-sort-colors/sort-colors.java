class Solution {
    public void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;
        while (mid <= high) {
            switch (nums[mid]) {
                case 0:
                    nums[mid++] = nums[low];
                    nums[low++] = 0;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    nums[mid] = nums[high];
                    nums[high--] = 2;
                    break;
            }
        }
    }
}