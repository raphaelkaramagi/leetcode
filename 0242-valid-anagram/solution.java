import java.util.*;

class Solution {
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
