class Solution {
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
