public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        //edge case
        
        //logic
        int mask = 1;
        int bits = 0;
        
        for(int i = 0; i < 32; i++){
            if((1 & n) == 1){
                bits++;
            }
            n = n >> 1;
        }
        
        return bits;
    }
}