class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int target = 0;
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int head = i + 1;
            int tail = nums.length - 1;

            while (head < tail) {
                int sum = nums[i] + nums[head] + nums[tail];

                if (sum == target) {
                    ans.add(Arrays.asList(nums[i], nums[head], nums[tail]));

                    while (head < tail && nums[head] == nums[head + 1]) head++;
                    while (head < tail && nums[tail] == nums[tail - 1]) tail--;

                    head++;
                    tail--;
                } else if (sum < target) {
                    head++;
                } else {
                    tail--;
                }
            }
        }
        return ans;
    }
}