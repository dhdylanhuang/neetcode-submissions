class Solution {
    public int search(int[] nums, int target) {
        int L = 0;
        int R = nums.length - 1;
        
        while(L <= R) {
            int index = (R + L) / 2;
            if (nums[index] == target) {
                return index;
            } else if (nums[index] > target){
                R = index - 1;
            } else {
                L = index + 1;
            }
        }

        return -1;
    }
}
