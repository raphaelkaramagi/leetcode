class Solution {
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
}
