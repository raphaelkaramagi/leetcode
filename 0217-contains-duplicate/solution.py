class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        map = {}
        status = False
        for num in nums:
            map[num] = map.get(num, 0) + 1
            if map.get(num) > 1:
                status = True
                break
        return status


