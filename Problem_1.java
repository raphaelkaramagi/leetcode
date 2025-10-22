// 1. Two Sum (EASY) (SOLVED)
// https://leetcode.com/submissions/detail/1804693191/

import java.util.*;

class Problem_1 {
    public int[] twoSum(int[] nums, int target) {

        // 0. Create a map<Integer, Integer> key: complement, value: index of original number
        // 0. Create List<String> output 
        // 1. Loop through each number with i
        //      2. Get the 'complement' : 9-number
        //      3. If (map.containsKey(number))
                        // output.add(map.get(number))
                        // output.add(i)
                        // break the loop
        //      4. Else Do map.put(complement, i)
        //      return list

        int[] output = new int[2];
        Map<Integer, Integer> complementMap = new HashMap<>();

        Integer[] numsIntegers = new Integer[nums.length];
        for(int i=0;i<nums.length;i++){
            numsIntegers[i] = Integer.valueOf(nums[i]);
        }

        for(Integer i=0; i<numsIntegers.length;i++){
            Integer complement = target - numsIntegers[i];
            if(complementMap.containsKey(numsIntegers[i])){
                output[0]=complementMap.get(numsIntegers[i]);
                output[1] = i;
                break;
            }
            else{
                complementMap.put(complement, i);
            }
        }

        return output;
    }
}
