class Solution:
    def carFleet(self, target: int, position: List[int], speed: List[int]) -> int:
        # (target - start distance) / speed = time to target 
        cars = dict(zip(position, speed))
        stack = []

        for p, s in sorted(cars.items())[::-1]:
            stack.append((target-p) / s)
            if len(stack) >= 2 and stack[-1] <=stack[-2]:
                stack.pop()

        return len(stack)


