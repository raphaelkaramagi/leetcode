from typing import List


# Very broken, need to work on this

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        output = []
        groups = {}

        for word in strs:
            mapped = self.mapper(word)

            if mapped in groups:
                groups[mapped].add(word)
            else:
                groups.setdefault(mapped, word)
        print(groups)

        return output

    def mapper(self, word: str):
        s = sorted(word)
        word = "".join(s)

        dict = {}
        for char in word:
            if char in dict:
                dict[char] += 1
            else:
                dict[char] = 1
        dictList = list(dict)
        stringList = [str(x) for x in dictList]
        result_string = ", ".join(stringList)
        print(result_string)

        return result_string

if __name__ == "__main__":
    mySolution = Solution()
    print(mySolution.groupAnagrams(["eat","tea","tan","ate","nat","bat"]))