class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numbers = new HashMap();
        int[] ans;
        for (int i = 0; i < nums.length; i++){
            numbers.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int lookFor = target - nums[i];
            if (numbers.containsKey(lookFor) && numbers.get(lookFor) != i) {
                return new int[]{i, numbers.get(lookFor)};
            }
        }
        return new int[]{};
    }
}
