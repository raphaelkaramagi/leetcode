public class Problem_1863 {
    
    // APPROACH 1: BRUTE FORCE - Generate all subsets using bit masking
    // Time: O(n * 2^n), Space: O(1)
    public int subsetXORSum(int[] nums) {
        int n = nums.length;
        int totalSum = 0;
        
        // There are 2^n subsets (including empty set)
        int totalSubsets = 1 << n;  // Same as Math.pow(2, n) but faster
        
        // Iterate through all possible subsets using binary representation
        for (int mask = 0; mask < totalSubsets; mask++) {
            int xorSum = 0;
            
            // Check each bit position in mask
            for (int i = 0; i < n; i++) {
                // If i-th bit is set in mask, include nums[i] in this subset
                if ((mask & (1 << i)) != 0) {
                    xorSum ^= nums[i];
                }
            }
            
            totalSum += xorSum;
        }
        
        return totalSum;
    }
    
    // APPROACH 2: BACKTRACKING (Alternative way to generate subsets)
    // Time: O(2^n), Space: O(n) for recursion stack
    public int subsetXORSum_Backtrack(int[] nums) {
        return backtrack(nums, 0, 0);
    }
    
    private int backtrack(int[] nums, int index, int currentXOR) {
        // Base case: processed all elements
        if (index == nums.length) {
            return currentXOR;
        }
        
        // Two choices for each element:
        // 1. Include nums[index] in current subset
        int include = backtrack(nums, index + 1, currentXOR ^ nums[index]);
        
        // 2. Exclude nums[index] from current subset
        int exclude = backtrack(nums, index + 1, currentXOR);
        
        // Return sum of both branches
        return include + exclude;
    }
    
    // APPROACH 3: OPTIMAL - Mathematical Trick!
    // Time: O(n), Space: O(1)
    // KEY INSIGHT: Each bit that is set in ANY element will contribute to exactly 2^(n-1) subsets
    public int subsetXORSum_Optimal(int[] nums) {
        int orOfAll = 0;
        
        // OR all numbers together - this gives us all bits that appear
        for (int num : nums) {
            orOfAll |= num;
        }
        
        // Each set bit appears in 2^(n-1) subsets
        // Multiply by 2^(n-1) which is left shift by (n-1)
        return orOfAll << (nums.length - 1);
    }
    
    // DEMO: Trace through example
    public static void main(String[] args) {
        Problem_1863 solution = new Problem_1863();
        
        int[] nums1 = {1, 3};
        System.out.println("Example 1: nums = [1, 3]");
        System.out.println("Brute Force: " + solution.subsetXORSum(nums1));
        System.out.println("Backtracking: " + solution.subsetXORSum_Backtrack(nums1));
        System.out.println("Optimal: " + solution.subsetXORSum_Optimal(nums1));
        System.out.println();
        
        int[] nums2 = {5, 1, 6};
        System.out.println("Example 2: nums = [5, 1, 6]");
        System.out.println("Brute Force: " + solution.subsetXORSum(nums2));
        System.out.println("Backtracking: " + solution.subsetXORSum_Backtrack(nums2));
        System.out.println("Optimal: " + solution.subsetXORSum_Optimal(nums2));
        
        // Let's trace [1, 3] manually
        System.out.println("\n=== MANUAL TRACE for [1, 3] ===");
        traceExample();
    }
    
    private static void traceExample() {
        int[] nums = {1, 3};
        System.out.println("nums = [1, 3]");
        System.out.println("Binary: [001, 011]");
        System.out.println("\nAll subsets (using mask 0-3):");
        
        int total = 0;
        for (int mask = 0; mask < 4; mask++) {
            System.out.print("mask=" + mask + " (" + 
                String.format("%2s", Integer.toBinaryString(mask)).replace(' ', '0') + 
                "): ");
            
            int xor = 0;
            String subset = "[";
            for (int i = 0; i < 2; i++) {
                if ((mask & (1 << i)) != 0) {
                    subset += nums[i] + ",";
                    xor ^= nums[i];
                }
            }
            if (subset.length() > 1) subset = subset.substring(0, subset.length()-1);
            subset += "]";
            
            System.out.println(subset + " → XOR = " + xor);
            total += xor;
        }
        System.out.println("\nTotal sum: " + total);
    }
}
