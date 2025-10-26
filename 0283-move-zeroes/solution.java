
class Solution {
    public void moveZeroes(int[] nums) {
        // start by moving all non zero  elements to front of array
        int i = 0;
        for (int num : nums) {
            if (num != 0) {
                nums[i] = num;
                i++;
            }
        }
        // fill rest of array (from i to end) with 0s
        while (i < nums.length) {
            nums[i] = 0;
            i++;
        }
    }

}
