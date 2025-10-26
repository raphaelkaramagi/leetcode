class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = n*(n+1)/2;

        int rollingSum = 0;

        for(int i=0; i<nums.length;i++){
            rollingSum += nums[i];
        }
        int missing = sum - rollingSum;
    return missing;
    }
}
