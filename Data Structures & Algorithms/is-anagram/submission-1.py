from collections import Counter

class Solution:
    def isAnagram(self, s: str, t: str) -> bool:

        s_dict = Counter(s)
        t_dict = Counter(t)

        

        for key in s_dict:
            if len(s_dict) != len(t_dict) or s_dict[key] != t_dict[key]:
                return False

        return True


        