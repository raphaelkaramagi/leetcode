// 26. Remove Duplicates from Sorted Array (EASY) (SOLVED)
// https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
// Key insights - use of two pointer approach and swapping and incrementing

public class Problem_26 {
    public int removeDuplicates(int[] nums) {
        // Since array is sorted, check adjacent elements if are equal
        // Initialize int count = 1, IF nums[].length > 1.;
        // Use 2 pointers, start and end. End increases, if next value is same as start, continue. If next value is different than start, swap start + 1 and end. Start increases by 1, end increases by 1, repeat, increment count.

    int count = 0;
    if(nums.length >0) count = 1;
    if(nums.length == 1) return count;

    int startIndex = 0;
    int currentIndex = 1;

    while(currentIndex < nums.length){
        if(nums[currentIndex] == nums[startIndex]){
            currentIndex++;
        }
        else{
            int temp = nums[startIndex+1];
            nums[startIndex+1] = nums[currentIndex];
            nums[currentIndex] = temp;
            startIndex++;
            currentIndex++;
            count++;
        }
    }

    return count;
    }
}
