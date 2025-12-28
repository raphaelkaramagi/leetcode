from typing import List

class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        output = []
        # Two Pointers
        left = 0
        right = len(numbers) -1
        while(left < right):
            sum = numbers[left] + numbers[right]
            if sum == target:
                output.append(left+1)
                output.append(right+1)
                break
            elif sum > target: right -=1
            else: left +=1

        return output
