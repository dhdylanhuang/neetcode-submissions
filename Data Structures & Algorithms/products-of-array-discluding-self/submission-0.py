class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        ans = []
        n = len(nums)

        for i in range(n):
            total = 1

            for j in range(n):
                if i == j:
                    continue
                total *= nums[j]

            ans.append(total)

        return ans

