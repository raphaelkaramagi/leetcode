from typing import List

class Solution:
        def twoSum(self, nums: List[int], target: int) -> List[int]:
            # Map of complements
            comps = {}
            output = []
            for i in range(len(nums)):
                if nums[i] in comps: 
                    output.append(i)
                    output.append(comps[nums[i]])
                    return output
                comps[target-nums[i]] = i

            return None
