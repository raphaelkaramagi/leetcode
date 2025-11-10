from typing import List

class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        # HashMap of complements
        output = []
        
        complements = {}

        for i, num in enumerate(nums):
            if num in complements:
                return [complements[num], i]
            complement = target - num
            complements[complement] = i
        return []
