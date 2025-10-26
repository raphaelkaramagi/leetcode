// 136. Single Number (EASY) (SOLVED)
// Key insights - XOR properties. a^a = 0. a^(b^c) = b^(a^x). 0^a = a.

public class Problem_136 {
    public int singleNumber(int[] nums) {
        // Constant extra space so no maps
        int result = 0;
        for(int i = 0; i<nums.length;i++){
                if(i<nums.length){
            result = result ^ nums[i];
            }
        }
        return result;
    }
}
