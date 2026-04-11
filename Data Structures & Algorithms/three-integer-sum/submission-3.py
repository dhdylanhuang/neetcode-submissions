class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        target = 0 
        fixed = 0
        
        sorted_nums = sorted(nums)
        ans = []

        while fixed < len(sorted_nums)-2: 
            
            if fixed > 0 and sorted_nums[fixed] == sorted_nums[fixed - 1]:
                fixed += 1
                continue
                
            head = fixed + 1
            tail = len(sorted_nums) - 1

            while head < tail:
                total = sorted_nums[fixed] + sorted_nums[head] + sorted_nums[tail]
                if total == target:
                    ans.append([sorted_nums[fixed], sorted_nums[head], sorted_nums[tail]])
                    head += 1
                    tail -= 1

                    while head < tail and sorted_nums[head] == sorted_nums[head - 1]:
                        head += 1
                    while head < tail and sorted_nums[tail] == sorted_nums[tail + 1]:
                        tail -= 1

                elif total > target:
                    tail -= 1
                else: 
                    head += 1
            fixed += 1
            
        return ans
