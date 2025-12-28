from typing import List

import math

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        output = []

        leftProd = 1
        left = []
        for leftNum in nums:
            left.append(leftProd)
            leftProd *= leftNum  

        rightProd = 1
        right = []
        for rightNum in reversed(nums):
            right.append(rightProd)
            rightProd *= rightNum  

        for i in range(len(nums)):
            output.append(left[i] * right[len(nums) - (i+1)])
    
        return output
