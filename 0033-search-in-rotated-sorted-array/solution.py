class Solution:
    def search(self, nums: List[int], target: int) -> int:
        left, right = 0, len(nums) - 1
        # Optimal solution: takeaway, right track, too compelx before. One half is always going to be normally sorted (main takeaway)

        while left <= right:
            mid = left + (right - left) // 2

            if nums[mid] == target:
                return mid

            # Case 1: Left half is normally sorted
            if nums[left] <= nums[mid]:
                if nums[left] <= target < nums[mid]:
                    right = mid - 1
                else:
                    left = mid + 1

            # Case 2: Right half is normally sorted
            else:
                if nums[mid] < target <= nums[right]:
                    left = mid + 1
                else:
                    right = mid - 1

        return -1

