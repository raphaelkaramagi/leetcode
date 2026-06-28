from collections import Counter

class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        list = []
        counted = Counter(nums)
        sort = sorted(counted.items(), key=lambda x:x[1], reverse=True)
        for i in range(k):
            list.append(sort[i][0])
        return list
