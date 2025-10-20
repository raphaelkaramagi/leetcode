class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;

        String inc1 = "++X";
        String inc2 = "X++";
        String dec1 = "--X";
        String dec2 = "X--";

        for (String operation : operations){
            if(operation.equals(inc1) || operation.equals(inc2)){
                x++;
        }
        else if(operation.equals(dec1) || operation.equals(dec2)){
            x--;
        }

        }
        
      return x;  
    }
}
