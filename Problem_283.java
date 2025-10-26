//283. Move Zeroes (EASY) (SOLVED)
// Key insight - count in array sequentially with counter i, if reaching non zero element, move it to where 
// it would be if there were no zeros. The amount of zeroes left will be where i ends up and the rest
// of the list is replaced with 0s.

/* 2 POINTER BASED SOLUTION
 * public void moveZeroes(int[] nums) {
        int j = 0; // Pointer to place the next non-zero element
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                // Swap current element with the element at index j 
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;   // Move j to the next index for placing non-zero
            }
        }
    }
 */

public class Problem_283 {
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
