import java.util.*;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        // PLAN:
        // 0. Handle empty/single-length edge cases
        // 1. Use sliding window with two pointers: left, right
        // 2. Track last seen index for each char in a map
        // 3. If current char was seen within window, move left to lastIndex + 1
        // 4. Update last seen index and max window length; return max

        if(s.length() == 0) return 0;
        if(s.length() ==1) return 1;
        int maxLength = 0;
        int left = 0;
        
        Map<Character, Integer> charIndexMap = new HashMap<>();
        for(int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);
            if(charIndexMap.containsKey(currentChar) && charIndexMap.get(currentChar) >= left) {
                left = charIndexMap.get(currentChar) + 1;
            }
            charIndexMap.put(currentChar, right);
            int currentLength = right - left + 1;
            maxLength = Math.max(maxLength, currentLength);
        }
        return maxLength;
    }
}

