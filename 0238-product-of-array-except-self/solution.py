class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        length = len(nums)
        output = [1] * length
        prodLastN = 1
        for i in range(length):
            if i != 0:
                output[i] = output[i-1] * nums[i]
            else:
                output[i] = nums[i]
        for j in range(length-1, -1, -1):
            if j != 0:
                output[j] = output[j-1] * prodLastN
            else:
                output[0] = prodLastN
            prodLastN *= nums[j]

            
        return output
        
            
