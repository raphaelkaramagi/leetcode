// Problem 2273 (EASY) (SOLVED)
// Didn't need 2 pointers, too complex (On*mlogm). See simpler solution:
/*
* Ideal solution below, adds first value, for each value, checks if it has the same anagram
* as the last value: if no, it gets added to output, if yes, continue. 
* Key here was finding the pattern, and breaking down problem into simpler one like above
* 
 * public class Problem_2273 {
    public List<String> removeAnagrams(String[] words) {
        List<String> output = new ArrayList<>();
        String prevSorted = "";
        
        for (String word : words) {
            String sortedWord = sortString(word);
            if (!sortedWord.equals(prevSorted)) {
                output.add(word);
                prevSorted = sortedWord;
            }
        }
        
        return output;
    }
    
    private String sortString(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
 */

import java.util.*;

public class Problem_2273 {
    public List<String> removeAnagrams(String[] words) {
        List<String> output = new ArrayList<>();

        if (words.length == 1){
            output.add(words[0]);
            return output;
        }

        int i = 0;
        int j = 1;

        while (i < words.length && j< words.length) {

            if(j == words.length-1){
                if(areAnagrams(words[i], words[j])){
                    output.add(words[i]);
                    break;
                }
                else{
                    output.add(words[i]);
                    output.add(words[j]);
                    break;
                }
            }
            else if(areAnagrams(words[i], words[j])){
                j++;
                continue;
            }
            else{
                output.add(words[i]);
                i=j;
                j++;
            }
        }

    return output;
    }

    private boolean areAnagrams(String a, String b) {
        char[] arrayA = a.toCharArray();
        Arrays.sort(arrayA);
        char[] arrayB = b.toCharArray();
        Arrays.sort(arrayB);
        if (Arrays.equals(arrayA, arrayB))
            return true;
        return false;
    }

    public static void main(String[] args) {
        Problem_2273 problem_2273 = new Problem_2273();
        String[] words = {"abba","baba","bbaa","cd","cd"};
        System.out.println(problem_2273.removeAnagrams(words));
    }
}
