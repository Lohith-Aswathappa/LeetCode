class Solution {
    public int[] plusOne(int[] digits) {
        //edge case
        // if(digits[0] == 0){
        //     return new int[]{1};
        // }
        //logic
        int carry = 0;
        int length = digits.length - 1;
        if(digits[length] <= 8){
            digits[length]++;
            return digits;
        }else{
            while(length >= 0 && digits[length] == 9){
                digits[length] = 0;
                carry = 1;
                length--;
            }
        }
        
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        
        if(length >= 0){
            digits[length]++;
        }
        else if(length < 0){
            for(int i = 0; i < digits.length; i++){
                result[i+1] = digits[i];
            }
            return result;
        }
        
        return digits;
    }
}
