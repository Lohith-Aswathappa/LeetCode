class Solution {
    public int[] countBits(int num) {
        //edge case
        
        //logic
        int[] result = new int[num+1];
        for(int i = 0; i <= num; i++)
        {
            result[i] = count(i);
        }
        
        return result;
    }
    
    private int count(int num){
        int mask = 1;
        int bits = 0;
        
        for(int i = 0; i < 32; i++){
            if((num & mask) == 1){
                bits++;
            }
            num = num >> 1;
        }
        
        return bits;
    }
}