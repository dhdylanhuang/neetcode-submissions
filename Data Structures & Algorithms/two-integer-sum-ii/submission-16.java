class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int head = 0;
        int tail = numbers.length - 1;
        int[] ans = new int[2];

        while(head < tail) {
            int sum = numbers[head] + numbers[tail];
            if (sum > target) {
                tail--;
            } else if (sum < target) {
                head++;
            } else {
                ans[0] = head + 1;
                ans[1] = tail + 1;
                return ans;
            }
        }
        return ans;
    }
}
