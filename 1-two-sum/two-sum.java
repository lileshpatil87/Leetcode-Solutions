class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int k = target - nums[i];
            if (hm.containsKey(k)) {
                return new int[] { i, hm.get(k) };
            }
            hm.put(nums[i], i);
        }
        return new int[] {};
    }
}