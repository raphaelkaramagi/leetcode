class Solution {
    public String convert(String s, int numRows) {
        if (numRows <= 1 || s.length() <= numRows) {
            return s;
        }

        StringBuilder sb = new StringBuilder();
        char[] chars = s.toCharArray();
        int n = chars.length;
        
        int maxStep = 2 * (numRows - 1);

        for (int j = 0; j < numRows; j++) {
            int i = j;
            
            sb.append(chars[i]);

            while (true) {
                int step1 = 2 * (numRows - 1 - j);
                
                if (step1 == 0) {
                    step1 = maxStep;
                }
                
                int nextIndex1 = i + step1;
                
                if (nextIndex1 < n) {
                    sb.append(chars[nextIndex1]);
                    i = nextIndex1;
                } else {
                    break;
                }
                
                int step2 = 2 * j;
                
                if (j != 0 && j != numRows - 1) {
                    int nextIndex2 = i + step2;
                    
                    if (nextIndex2 < n) {
                        sb.append(chars[nextIndex2]);
                        i = nextIndex2;
                    } else {
                        break;
                    }
                }
            }
        }

        return sb.toString();
    }
}
