class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        map = {}
        list = []
        for word in strs:
            key = "".join(sorted(word))
            map.setdefault(key,[]).append(word)
        for key in map:
            list.append(map.get(key))
        return list
            
        
