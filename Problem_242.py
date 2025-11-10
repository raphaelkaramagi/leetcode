class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        sDict = {}
        for char in list(s):
            if char not in sDict:
                sDict.setdefault(char, 0)
            sDict[char] += 1

        tDict = {}
        for char in list(t):
            if char not in tDict:
                tDict.setdefault(char, 0)
            tDict[char] += 1

        return sDict == tDict

if __name__ == "__main__":
    mySolution = Solution()
    print(mySolution.isAnagram("cat", "cat"))

"""Most Efficient Solution

from collections import Counter

class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        return Counter(s) == Counter(t)

        """