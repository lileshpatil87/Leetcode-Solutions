class Solution {
    public int carFleet(int target, int[] position, int[] speed) {

        TreeMap<Integer, Double> mp = new TreeMap<>(Collections.reverseOrder());
        for (int i = 0; i < position.length; i++) {
            double t = (double)(target - position[i]) / speed[i];
            mp.put(position[i], t);
        }
        double leadTime = mp.get(mp.firstKey());
        int count = 1;
        for (double x : mp.values()) {
            if (x > leadTime) {
                leadTime = x;
                count++;
            }
        }
        return count;
    }
}