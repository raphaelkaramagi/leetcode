class Solution {
    public static int maximumCount(int[] nums) {
        int negCount = countNegatives(nums);
        int posCount = countPositives(nums);
        return Math.max(negCount, posCount);
    }

    private static int countNegatives(int[] nums) {
        int left = 0, right = nums.length - 1;
        int count = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] < 0) {
                count = mid + 1; // All elements from 0 to mid are negative
                left = mid + 1; // Search right for more negatives
            } else {
                right = mid - 1; // Search left
            }
        }

        return count;
    }

    private static int countPositives(int[] nums) {
        int left = 0, right = nums.length - 1;
        int count = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > 0) {
                count = nums.length - mid; // All elements from mid to end are positive
                right = mid - 1; // Search left for first positive
            } else {
                left = mid + 1; // Search right
            }
        }

        return count;
    }
}
