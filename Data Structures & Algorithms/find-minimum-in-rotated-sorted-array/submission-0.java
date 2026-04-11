class Solution {
    public int findMin(int[] nums) {
        int L = 0;
        int R = nums.length - 1;

        while (L < R) {
            int mid = (L + R) / 2;

            if (nums[mid] > nums[R]) {
                // minimum is in the right half
                L = mid + 1;
            } else {
                // minimum is in the left half (including mid)
                R = mid;
            }
        }

        // L == R, pointing at minimum
        return nums[L];
    }
}
