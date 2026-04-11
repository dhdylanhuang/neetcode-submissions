class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:

        top_k = []
        dictionary = Counter(nums)
        
        for i in range(k):
            top_k.append(dictionary.most_common(i+1)[i][0])

        return top_k
        
