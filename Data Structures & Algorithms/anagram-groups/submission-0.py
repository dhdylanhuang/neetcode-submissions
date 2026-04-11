from collections import Counter
from typing import List

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        anagrams = []
        list_of_dicts = []
        for i in range(len(strs)):
            current_string = Counter(strs[i])
            placed = False

            for j in range(len(list_of_dicts)):
                if current_string == list_of_dicts[j]:
                    anagrams[j].append(strs[i])
                    placed = True 
                    break 
            
            if not placed:
                list_of_dicts.append(current_string)
                anagrams.append([strs[i]])

        return anagrams
            