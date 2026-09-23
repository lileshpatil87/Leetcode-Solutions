class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        TreeMap<Integer, Double> tm = new TreeMap<>(Collections.reverseOrder());
        for (int i = 0; i < position.length; i++) {
            double time = (double) (target - position[i]) / speed[i];
            tm.put(position[i], time);
        }
        int count = 0;
        double mt = -1;
        for (double crr : tm.values()) {
            if (crr > mt) {
                mt = crr;
                count++;
            }
        }
        return count;
    }
}