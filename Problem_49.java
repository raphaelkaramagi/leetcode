/*  49. Group Anagrams (MEDIUM) (SOLVED)
 https://leetcode.com/problems/group-anagrams/
 Accepted. 
 Key concepts learned: 
 * 1. Understand the problem completely
What are we grouping by? (anagrams = same character frequencies)
What's the relationship? (many-to-one: many strings → one signature)
2. Think about data structures first
Need to group things? → Think HashMap
What should be the key? → The property that defines the group (signature)
What should be the value? → The things being grouped (list of strings)
3. Consider edge cases
Empty strings
Duplicate strings ← You missed this!
Single character
Very long strings
4. Analyze complexity before coding
If you're writing nested loops over n items → O(n²) → Warning! ⚠️
Can I do this in one pass? → O(n) → Good! ✓
For grouping problems, aim for O(n × k) where k is item size
 */

import java.util.*;

class Problem_49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groups = new LinkedHashMap<>();
    
        for(String word : strs){
        String signature = createSignature(word);
        
        if(!groups.containsKey(signature)){
            groups.put(signature, new ArrayList<>());
        }
        groups.get(signature).add(word);
    }
    
    return new ArrayList<>(groups.values());
    }

    private String createSignature(String word){
        Map<Character, Integer> map = mapper(word);
        return map.toString();
    }

    private Map<Character, Integer> mapper(String word){
        
        Map<Character, Integer> output = new LinkedHashMap<>();
        char[] chars = word.toCharArray();
        Arrays.sort(chars);

        for(char ch: chars){
            output.put(ch, output.getOrDefault(ch, 0)+1);
        }
        return output;
    }



    public static void main(String[] args) {
        Problem_49 problem_49 = new Problem_49();
        String[] strs = {"chi","nip","lab","mud","fan","yak","kid","lox","joy","rob","cad","hug","ken","oaf","pus","hos","ton","any","sac","mid","nip","ron","tux","set","jug","axe","ago","sob","ode","dot","nit","pug","sue","new","rub","sup","ohs","ski","oaf","don","cob","kin","ark","gay","jay","bur","dot","eat","rca","wad","maj","luz","gad","dam","eon","ark","del","sin","tat"};
        System.out.println(problem_49.groupAnagrams(strs).toString());
    }
}