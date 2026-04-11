class TimeMap {

    private Map<String, List<Integer>> timestamps;
    private Map<String, List<String>> values;

    public TimeMap() {
        timestamps = new HashMap<>();
        values = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        timestamps.computeIfAbsent(key, k -> new ArrayList<>()).add(timestamp);
        values.computeIfAbsent(key, k -> new ArrayList<>()).add(value);
    }
    
    public String get(String key, int timestamp) {
        if(!timestamps.containsKey(key)) return "";

        List<Integer> times = timestamps.get(key);

        int l = 0;
        int r = times.size() - 1;
        int idx = -1;

        while(l<=r) {
            int mid = (r + l) /2;
        

            if (times.get(mid) <= timestamp) {
                idx = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        return idx == -1 ? "" : values.get(key).get(idx);
    }
}
