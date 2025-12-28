from typing import List
from collections import defaultdict

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        charMap = defaultdict(list)

        for string in strs:
            chars = sorted(string)
            charMap[tuple(chars)].append(string)

        return list(charMap.values())
