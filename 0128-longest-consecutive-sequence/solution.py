class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        unique_nums = set(nums)
        max_length = 0
        
        for num in unique_nums:
            if num - 1 not in unique_nums:
                current_num = num
                current_length = 1
                
                while current_num + 1 in unique_nums:
                    current_num += 1
                    current_length += 1
                    
                max_length = max(max_length, current_length)
                
        return max_length
