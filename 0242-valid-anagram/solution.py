class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        sMap = {}
        for ch in s:
            sMap[ch] = sMap.get(ch,0) + 1
        tMap = {}
        for ch in t:
            tMap[ch] = tMap.get(ch,0) + 1
        if sMap == tMap:
            return True
        return False
        
