// 242. Valid Anagram (EASY)(SOLVED)
// https://leetcode.com/problems/valid-anagram/
// O(N)

import java.util.*;

class Problem_242 {
    public boolean isAnagram(String s, String t) {

        if(mapper(s).equals(mapper(t))){
            return true;
        }

        return false;
    }

    private Map<Character, Integer> mapper(String a){
        Map<Character, Integer> map = new HashMap<>();

        for(char ch : a.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        return map;
    }
}