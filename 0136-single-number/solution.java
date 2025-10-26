class Solution {
    public int singleNumber(int[] nums) {
        // Constant extra space so no maps
        int result = 0;;
        for(int i = 0; i<nums.length;i++){
            if(i<nums.length){
            result = result ^ nums[i];
            }
        }
        return result;
    }
}
