class Solution:
    def findMin(self, nums: List[int]) -> int:
        # Start by checking if STRICTLY nums[left] < nums[len(nums)-1]: if yes, output nums[left] (no cycles/exact repeat), if no  (ie >=) then cycles and hence need to find the inflection point (being the min val)
        # Start modified binary search:
        # Find middle: left + (right-left)//2
        # Compare middle and the nums[left] and nums[right] - the side which isn't chronological (ie numms[left > middle etc.]) is the side with the inflection point and hence the min


        if nums[0] < nums[(len(nums)-1)]: 
            return nums[0]

        left = 0
        right = len(nums)-1

        while(left<=right):
            mid = left + (right-left)//2

            if nums[mid]<nums[left]:
                right = mid
                if left ==right:
                    return nums[left]
                continue
            elif nums[mid]>nums[right]:
                left = mid+1
                if left ==right:
                    return nums[left]
                continue
            else:
                return nums[left]

            

        return None


