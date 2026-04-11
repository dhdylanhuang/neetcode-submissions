class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[k];

        for (int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        List<Integer> sorted = new ArrayList<>(map.keySet());
        Collections.sort(sorted, (a, b) -> map.get(b) - map.get(a));

        for(int i = 0; i < k; i++){
            ans[i] = sorted.get(i);
        }

        return ans;
    }
}
