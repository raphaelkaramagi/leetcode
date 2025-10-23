/*
 * 11. Container with most water (MEDIUM) (SOLVED)
 * Solved alone after learning about concepts of pointers.
 * https://leetcode.com/problems/container-with-most-water/description/
 */

class Problem_11 {
    public int maxArea(int[] height) {
        // PLAN
        // 0. init maxArea =0; return maxArea;
        // 0. Create a pointer at the far left and right
        // 1. Calculate the area (smaller value * difference), and assign it to maxArea;
        // 2. Compare the 2 pointers, move the smaller one inward until its larger than the other pointer
        // 3. Calculate area again if found, assign to maxArea.

        int maxArea = 0;

        int steps = 0;
        int leftPointer = 0;
        int rightPointer = height.length -1;

        while(steps < height.length -1){
            int leftHeight = height[leftPointer];
            int rightHeight = height[rightPointer];
            int minHeight = Math.min(leftHeight, rightHeight);

            maxArea = Math.max((minHeight * (rightPointer-leftPointer)), maxArea);

            if(leftHeight<=rightHeight){
                    leftPointer++;
                    steps++;

            }
            else if(rightHeight<=leftHeight){
                    rightPointer--;
                    steps++;

            }

        }
    return maxArea;
    }

    public static void main(String[] args) {
        Problem_11 problem_11 = new Problem_11();
        int[] height = {1,1};

        problem_11.maxArea(height);
    }

}
