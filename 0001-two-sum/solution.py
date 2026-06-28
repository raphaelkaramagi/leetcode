class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        map = {}
        list = []
        for index, num in enumerate(nums):
            comp = target - num
            if comp in map:
                list.append(map.get(comp))
                list.append(index)
                return list
            map[num] = map.get(num,0) + index
        return None
                
