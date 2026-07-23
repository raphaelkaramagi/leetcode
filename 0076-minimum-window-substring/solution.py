from collections import Counter
import math

class Solution:
    def minWindow(self, s: str, t: str) -> str:

        if(len(t)>len(s)):
            return ""
        
        left = 0
        benchmark = Counter(t)
        counts = Counter()
        minLen = math.inf
        bestStartingIndex = 0
        have = 0
        need = len(benchmark)

        for right in range(len(s)):
            counts[s[right]]+=1
            if(counts[s[right]]==benchmark[s[right]]):
                have+=1
            while(have==need):
                if minLen > right-left+1:  
                    minLen = right-left+1
                    bestStartingIndex = left
                counts[s[left]]-=1
                if(s[left] in benchmark and counts[s[left]]<benchmark[s[left]]):
                    have-=1
                left+=1

        if minLen == math.inf:
            return ""

        return s[bestStartingIndex:bestStartingIndex+minLen]
