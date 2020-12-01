public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        //edge case
        
        //logic
        int mask = 1;
        int bits = 0;
        
        for(int i = 0; i < 32; i++){
            if((mask & n) != 0){
                bits++;
            }
            mask <<= 1;
        }
        
        return bits;
    }
}
