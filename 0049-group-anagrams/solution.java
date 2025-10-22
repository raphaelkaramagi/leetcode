import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groups = new HashMap<>();

        for (String word : strs) {
            String signature = createSignature(word);

            if (!groups.containsKey(signature)) {
                groups.put(signature, new ArrayList<>());
            }
            groups.get(signature).add(word);
        }

        return new ArrayList<>(groups.values());
    }

    private String createSignature(String word) {
        Map<Character, Integer> map = mapper(word);
        return map.toString();
    }

    private Map<Character, Integer> mapper(String word){
        
        Map<Character, Integer> output = new HashMap<>();
        char[] chars = word.toCharArray();
        Arrays.sort(chars);

        for(char ch: chars){
            output.put(ch, output.getOrDefault(ch, 0)+1);
        }
        return output;
    }

}
