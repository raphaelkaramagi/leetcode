class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        # Start with right, if target-right < left: decrease right 
        
        left = 0
        right = len(numbers)-1

        while left < right:
            if numbers[left] > target - numbers[right]:
                right-=1
            elif numbers[left] == target - numbers[right]:
                break
            else:
                left+=1

        solution = [left+1, right+1]
        return solution
        
