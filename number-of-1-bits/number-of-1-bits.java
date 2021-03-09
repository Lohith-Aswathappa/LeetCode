public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        //edge case
        if( n == 0){
            return 0;
        }
        //logic
        int bits = 0;
        int mask = 1;
        
        for(int i = 0; i < 32; i++){
            if((n & mask) != 0){
                bits++;
            }
            mask = mask << 1;
        }
        
        return bits;
    }
}