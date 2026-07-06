from collections import defaultdict

class Solution:
    def threeSum(self, nums: list[int]) -> list[list[int]]:
        # CAN BE O(N^2)
        # For each number x, need 2 numbers that add up to -x
        #   Iterate through nums, do twosum on each entry with value being -x, return those nums
        #   Make a dict keyed by -x, with val being arrays of 2 nums adding to -x
        # For checking if triplets are distinct, use map/count counts of each number
        
        output = []
        nums.sort()

        for i, num in enumerate(nums):
            if i>0 and num == nums[i-1]: 
                continue
            twoSum = self.twoSum(nums,-num, i)
            if twoSum == None:
                continue
            else:
                for sequence in twoSum:
                    triplet = []
                    triplet.append(num)
                    triplet.append(sequence[0])
                    triplet.append(sequence[1])
                    output.append(triplet)


        return output

    def twoSum(self, nums:list[int], value: int, index: int):
        left = index +1
        right = len(nums)-1
        output = []
        
        while left < right:
            if nums[right]>value-nums[left]:
                right-=1
            elif nums[right] == value-nums[left]:
                output.append([nums[right], nums[left]])
                left+=1
                right-=1
                while(nums[left]==nums[left-1] and left<right):
                    left+=1
                while(nums[right]==nums[right+1] and left<right):
                    right-=1
            else:
                left+=1
        return output
        
