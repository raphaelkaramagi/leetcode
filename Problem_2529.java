// 2529. Maximum Count of Positive Integer and Negative Integer (EASY) (SOLVED) in O(N)
// My solution as the easy O(N) one. Binary search implemented below in LOGN.
// Easy O(N)Solution:
/*
 * public int maximumCount(int[] nums) {
        int posCount = 0;
        int negCount = 0;
        for(int num:nums){
            if(num > 0) posCount++;
            if(num<0) negCount++;
        }
    return Math.max(posCount, negCount);
    }
 */

public class Problem_2529 {
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
                count = mid + 1;  // All elements from 0 to mid are negative
                left = mid + 1;   // Search right for more negatives
            } else {
                right = mid - 1;  // Search left
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
            count = nums.length - mid;  // All elements from mid to end are positive
            right = mid - 1;            // Search left for first positive
        } else {
            left = mid + 1;             // Search right
        }
    }
    
    return count;
}


    public static void main(String[] args) {
        int[] nums = {-3,-2,-1,0,0,1,2};
        System.out.println(maximumCount(nums));
    }
}
