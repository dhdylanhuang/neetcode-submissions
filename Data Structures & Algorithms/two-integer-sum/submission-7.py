class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        ans = []
        for i in range(len(nums)):
            look_for = target - nums[i]
            sliced_list = nums[i+1:]
            if look_for in sliced_list:
                ans.append(i)
                ans.append(sliced_list.index(look_for)+i+1)
                return ans

        return ans
        