class Solution:
    def findMin(self, nums: List[int]) -> int:
        # Start by checking if STRICTLY nums[left] < nums[len(nums)-1]: if yes, output nums[left] (no cycles/exact repeat), if no  (ie >=) then cycles and hence need to find the inflection point (being the min val)
        # Start modified binary search:
        # Find middle: left + (right-left)//2
        # Compare middle and the nums[left] and nums[right] - the side which isn't chronological (ie numms[left > middle etc.]) is the side with the inflection point and hence the min


        left, right = 0, len(nums) - 1

        while left < right:
            mid = left + (right - left) // 2

            # The right half is broken; minimum must be right of mid
            if nums[mid] > nums[right]:
                left = mid + 1
            # The right half is sorted; mid could be the minimum, or it's left of mid
            else:
                right = mid

        # Loop ends when left == right, pointing directly to the minimum
        return nums[left]

