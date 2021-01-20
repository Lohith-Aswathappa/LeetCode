/**
 * // This is ArrayReader's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface ArrayReader {
 *     public int get(int index) {}
 * }
 */
​
class Solution {
    public int search(ArrayReader reader, int target) {
        //edge case
        
        //logic
        int i = 1;
        int start = 0;
        while(reader.get(i) <= target){
            start = i;
            i = i*2;
        }
        
        int end = i;
        
        while(start <= end){
            int mid = start + (end - start)/2;
            
            if(reader.get(mid) == target){
                return mid;
            }
            
            if(reader.get(mid) < target){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        
        return -1;
    }
}
