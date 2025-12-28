from typing import List
from collections import defaultdict

class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        if len(nums) == 0: return None

        map = defaultdict(int) 
        for num in nums:
            map[num] +=1
        topK = sorted(map.items(), key=lambda item: item[1], reverse=True)[:k]
        topKeys = [item[0] for item in topK]

        return topKeys
