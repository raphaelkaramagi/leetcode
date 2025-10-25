// 2433. Find The Original Array of Prefix Xor (MEDIUM) (SOLVED)

// BIT MANIPULATION CHEAT SHEET:
// XOR: a ^ 0 = a | a ^ a = 0 | a ^ b = b ^ a | (a^b)^c = a^(b^c) | a^b^b = a (cancellation)
// AND: a & 1 (check odd) | a & (a-1) (remove rightmost bit) | a & -a (isolate rightmost bit)
// OR:  a | b (set bits) | a |= (1 << i) (set ith bit)
// NOT: ~a (flip all bits) | ~a + 1 = -a (two's complement)
// SHIFT: a << 1 (*2) | a >> 1 (/2) | 1 << n (power of 2)
// TRICKS: n & (n-1) == 0 (power of 2) | x ^ y == 0 (x equals y)
// XOR SWAP: a^=b; b^=a; a^=b; (swap without temp)
// COMMON: Finding unique in pairs, prefix XOR, toggle bits, count set bits

import java.util.Arrays;

public class Problem_2433 {

    public int[] findArray(int[] pref) {
        // pref[i] = arr[0] ^ arr[1] ^ ... ^ arr[i]
        // pref[i-1] = arr[0] ^ arr[1] ^ ... arr[i-1]
        // SO pref[i] = pref[i-1] ^ arr[i]
        // AND arr[i] = pref[i] ^ pref[i-1]

        // arr[0] = pref[0]
        // arr[1] = = pref[1] ^ pref[0]
        // arr[2] =  pref[2] ^ pref[1]
        // arr[i] = pref[i] ^ pref[i-1]

        int[] arr = new int[pref.length];
        arr[0] = pref[0];
        
        for(int i = 1; i < pref.length; i++){
            arr[i] = pref[i] ^ pref[i-1];
        }
        
        return arr;
    }    
    public static void main(String[] args) {
        Problem_2433 problem_2433 = new Problem_2433();
        int[] pref = {5,2,0,3,1};
        System.out.println(Arrays.toString(problem_2433.findArray(pref)));
    }
          
}
