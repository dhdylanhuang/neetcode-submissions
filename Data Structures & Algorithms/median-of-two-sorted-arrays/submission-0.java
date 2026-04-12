class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }

        int m = nums1.length;
        int n = nums2.length;
        int total = m + n;
        int half = total / 2;

        int l = 0;
        int r = m;

        while (l <= r) {
            int part1 = l + (r - l) / 2;
            int part2 = half - part1;

            int nums1Left  = (part1 == 0) ? Integer.MIN_VALUE : nums1[part1 - 1];
            int nums1Right = (part1 == m) ? Integer.MAX_VALUE : nums1[part1];
            int nums2Left  = (part2 == 0) ? Integer.MIN_VALUE : nums2[part2 - 1];
            int nums2Right = (part2 == n) ? Integer.MAX_VALUE : nums2[part2];

            if (nums1Left <= nums2Right && nums2Left <= nums1Right) {
                if (total % 2 == 1) {
                    return Math.min(nums1Right, nums2Right);
                }
                return (Math.max(nums1Left, nums2Left) + Math.min(nums1Right, nums2Right)) / 2.0;

            } else if (nums1Left > nums2Right) {
                r = part1 - 1;
            } else {
                l = part1 + 1; 
            }
        }

        return -1;
    }
}