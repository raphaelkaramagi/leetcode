// 1. Two Sum (EASY) (SOLVED)
// https://leetcode.com/submissions/detail/1804693191/

import java.util.*;

class Problem_1 {
    public int[] twoSum(int[] nums, int target) {

    Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
