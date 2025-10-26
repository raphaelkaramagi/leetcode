public class Problem_190 {
    public static int reverseBits(int n) {
        int result = 0;
        
        for (int i = 0; i < 32; i++) {
            // Shift result left to make room for next bit
            result <<= 1;
            
            // Extract rightmost bit of n and add to result
            result |= (n & 1);
            
            // Shift n right to process next bit
            n >>= 1;
        }
        
        return result;
    }
    public static void main(String[] args) {
        System.out.println(reverseBits(43261596));
    }  
}
