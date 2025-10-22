/*
 * 11. Container with most water (MEDIUM) (SOLVED)
 * Didn't fully solve alone - learned about lsiding window.
 * https://leetcode.com/problems/container-with-most-water/description/
 */

class Problem_11 {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            int width = right - left;
            int minHeight = Math.min(height[left], height[right]);
            int area = width * minHeight;

            maxArea = Math.max(maxArea, area);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }

    public static void main(String[] args) {
        Problem_11 problem_11 = new Problem_11();
        int[] height = {1,8,6,2,5,4,8,3,7};

        problem_11.maxArea(height);
    }

}
