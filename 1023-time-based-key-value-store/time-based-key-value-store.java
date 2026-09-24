class TimeMap {
    HashMap<String, TreeMap<Integer, String>> hm = new HashMap<>();

    public TimeMap() {

    }

    public void set(String key, String value, int timestamp) {
        TreeMap<Integer, String> tm = hm.getOrDefault(key, new TreeMap<>());
        tm.put(timestamp, value);
        hm.put(key, tm);
    }

    public String get(String key, int timestamp) {
        TreeMap<Integer, String> tm = hm.getOrDefault(key, new TreeMap<>());
        if (tm.floorKey(timestamp) != null) {
            return tm.get(tm.floorKey(timestamp));
        }
        return "";
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */