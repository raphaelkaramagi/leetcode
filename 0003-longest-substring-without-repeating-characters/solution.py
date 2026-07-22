class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        unique = set()
        leftI = 0
        longest = 0
        
        for rightI in range(len(s)):
            while s[rightI] in unique:
                unique.remove(s[leftI])
                leftI += 1
            
            unique.add(s[rightI])
            longest = max(longest, rightI - leftI + 1)
            
        return longest
