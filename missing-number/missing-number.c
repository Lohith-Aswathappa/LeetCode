

int missingNumber(int* nums, int numsSize){
    
    int miss = numsSize;
    
    for(int i = 0; i < numsSize; i++){
        miss ^= nums[i] ^ i;
    }
    
    return miss;
}