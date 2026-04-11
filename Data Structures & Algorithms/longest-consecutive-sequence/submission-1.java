class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int count = 0;

        for (int num : nums) {
            set.add(num);
        }

        for(int i = 0; i < nums.length; i++) {
            int tempCount = 1;
            int current = nums[i];
            if (!set.contains(current-1)) {
                while(set.contains(current+1)){
                    tempCount++;
                    current++;
                }
                count = Math.max(count, tempCount);

            }
        }

        return count;
    }
}
