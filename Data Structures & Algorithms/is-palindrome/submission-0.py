class Solution:
    def isPalindrome(self, s: str) -> bool:
        clean = list(re.sub('[^A-Za-z0-9]+', '', s).lower())
        head = 0
        tail = len(clean) - 1

        while head < tail:
            if clean[head] != clean[tail]:
                return False
            head += 1
            tail -= 1

        return True