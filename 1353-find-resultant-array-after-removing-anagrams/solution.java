import java.util.*;

class Solution {
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
}
