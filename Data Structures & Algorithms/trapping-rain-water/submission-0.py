class Solution:
    def trap(self, height: List[int]) -> int:
        if not height: return 0

        head = 0 
        tail = len(height) - 1
        left_max = height[head]
        right_max = height[tail]
        total = 0

        while head < tail:
            if left_max < right_max:
                head += 1
                left_max = max(left_max, height[head])
                total += left_max - height[head]
            else:
                tail -= 1
                right_max = max(right_max, height[tail])
                total += right_max - height[tail]

        return total