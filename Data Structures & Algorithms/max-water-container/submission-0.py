class Solution:
    def maxArea(self, heights: List[int]) -> int:
        head = 0 
        tail = len(heights) - 1
        max_area = 0 

        while head < tail:
            area = (tail - head) * min(heights[head], heights[tail])
            max_area = max(max_area, area)

            if heights[head] < heights[tail]:
                head += 1
            elif heights[head] > heights[tail]:
                tail -= 1
            else:
                head += 1

        return max_area