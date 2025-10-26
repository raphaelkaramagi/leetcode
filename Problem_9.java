// 9. Is Palindrom (EASY) (SOLVED)
/* Key understanding - using 2 pointers
* 
 * Simple gemini solution:
 * public boolean isPalindrome(int x) {
        // 1. Negative numbers cannot be palindromes (e.g., -121 != 121-).
        if (x < 0) {
            return false;
        }

        // 2. Convert to string for easy two-pointer comparison.
        String s = String.valueOf(x); 
        int i = 0;
        int j = s.length() - 1;

        // 3. Two-pointer check: iterate inwards until the pointers meet or cross.
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false; // Mismatch found
            }
            // Move pointers inward
            i++;
            j--;
        }

        // If the loop completes, the number is a palindrome.
        return true;
    }

 */

public class Problem_9 {
    public boolean isPalindrome(int x) {
        boolean valid = false;
        String s = String.valueOf(x); 

        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            digits[i] = Character.getNumericValue(s.charAt(i)); 
        }
        int i = 0;
        int j = digits.length-1;
        int left = digits[i];
        int right = digits[j];

        if(digits.length > 3){
            while(left == right){
                if((digits.length%2==1)&&((j-i)<2)){
                return true;
                }
                if((digits.length%2==0)&&((j-i)==1)){
                    return true;
                }
                i++;
                left = digits[i];
                j--;
                right = digits[j];
                }
            
        }
        else if(left == right){
            return true;
        }

    return valid;
    }
}
