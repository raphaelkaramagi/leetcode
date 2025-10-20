import java.util.*;

/*
 * 3. Longest Substring Without Repeating Characters
 *  Given a string s, find the length of the longest substring without duplicate characters.
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
 * 
 * 987/988 Test Cases Passed. Complexity O(N^2) - look into 'sliding window' technique
 to reduce to O(N).
 */

public class problem_3 {


    public int lengthOfLongestSubstring(String s) {

        char[] chars = s.toCharArray();
        Character[] characters = new Character[chars.length];
        for (int i=0; i<chars.length;i++){
            characters[i] = chars[i];
        }
        List<Character> charactersList = Arrays.asList(characters);
        LinkedList<Character> charactersLinked = new LinkedList<>(charactersList);

        int maxLength = 0;
        boolean validSubstring = false;

        for(int i=0; i<characters.length; i++){
            Set<Character> seenChars = new HashSet<>();
            int length = 0;

            ListIterator<Character> iterator = charactersLinked.listIterator(i);
            if(characters.length > 0) validSubstring = true;

            while(validSubstring && iterator.hasNext()){
                

                    Character currentElement = iterator.next(); 
                    System.out.println(currentElement);

                    if(seenChars.contains(currentElement)){
                        validSubstring = false;
                    } else {
                        seenChars.add(currentElement);
                        length++;
                    }

                    maxLength = Math.max(maxLength, length);
                }   
        }

        return maxLength;
    }
    public static void main(String[] args) {
        problem_3 problem_3 = new problem_3();
        String s = "abcabcbb";
        System.out.println(problem_3.lengthOfLongestSubstring(s));
    }

}
