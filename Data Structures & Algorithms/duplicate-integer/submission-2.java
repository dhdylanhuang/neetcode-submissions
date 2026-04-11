class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> noDuplicates = new HashSet<Integer>();
        for (int num : nums){
            noDuplicates.add(num);
        }
        return noDuplicates.size() != nums.length;
    }
}