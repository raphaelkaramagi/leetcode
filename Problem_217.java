// 217. Contains Duplicate (EASY) (SOLVED)
// Complete.
// https://leetcode.com/problems/contains-duplicate/

import java.util.*;

class Problem_217 {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> numsMap = new HashMap<>();

        Integer[] numsObjects = new Integer[nums.length];
        for(int i=0; i<nums.length;i++){
            numsObjects[i] = Integer.valueOf(nums[i]);
        }

        for(Integer num: numsObjects){
            numsMap.putIfAbsent(num,0);
            if(numsMap.get(num).equals(1)) return true;
            numsMap.put(num, 1);
        }
        return false;
    }
}