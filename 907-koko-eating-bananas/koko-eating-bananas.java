class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < piles.length; i++) {
            if (max < piles[i]) {
                max = piles[i];
            }
        }
        int left = 1;
        int right = max;
        int min = 0;
        while (left <= right) {
            int k = (left + right) / 2;
            long hc = 0;
            for (int i = 0; i < piles.length; i++) {
                long cc = (piles[i] + k - 1) / k;
                hc += cc;
            }
            if (hc <= h) {
                right = k - 1;
                min = k;
            } else {
                left = k + 1;
            }
        }
        return min;
    }
}