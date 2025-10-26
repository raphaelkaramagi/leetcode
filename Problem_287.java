public class Problem_287 {
    public static void main(String[] args) {
        // Test case: [1,3,4,2,2] - duplicate is 2
        int[] nums = {1, 3, 4, 2, 2};
        
        System.out.println("Array: [1, 3, 4, 2, 2]");
        System.out.println("Duplicate found: " + findDuplicate(nums));
        System.out.println();
        
        // Visualize how the algorithm works
        visualizeAlgorithm(nums);
    }
    
    public static int findDuplicate(int[] nums) {
        
        int slow = nums[0];  
        int fast = nums[0]; 

        do {
            slow = nums[slow];         
            fast = nums[nums[fast]];    
        } while (slow != fast);

        slow = nums[0];
        

        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        
        return slow;  
    }
    
    public static void visualizeAlgorithm(int[] nums) {
        System.out.println("=== PHASE 1: Finding Intersection ===");
        System.out.println("Array as 'linked list':");
        System.out.println("Index 0 -> nums[0] = " + nums[0] + " (go to index " + nums[0] + ")");
        System.out.println("Index 1 -> nums[1] = " + nums[1] + " (go to index " + nums[1] + ")");
        System.out.println("Index 2 -> nums[2] = " + nums[2] + " (go to index " + nums[2] + ")");
        System.out.println("Index 3 -> nums[3] = " + nums[3] + " (go to index " + nums[3] + ")");
        System.out.println("Index 4 -> nums[4] = " + nums[4] + " (go to index " + nums[4] + ")");
        System.out.println();
        
        int slow = nums[0];
        int fast = nums[0];
        int step = 0;
        
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
            step++;
            System.out.println("Step " + step + ": slow at index " + slow + ", fast at index " + fast);
        } while (slow != fast);
        
        System.out.println("Meeting point: index " + slow);
        System.out.println();
        
        System.out.println("=== PHASE 2: Finding Cycle Entrance ===");
        slow = nums[0];
        step = 0;
        
        System.out.println("Reset slow to start (index " + slow + "), fast stays at " + fast);
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
            step++;
            System.out.println("Step " + step + ": slow at index " + slow + ", fast at index " + fast);
        }
        
        System.out.println("Cycle entrance (duplicate): " + slow);
    }
}
