class Solution {
    public int maxArea(int[] height) {
        //edge case
        if(height == null || height.length == 0)
            return 0;
        //logic
        int right = height.length - 1;
        int left = 0;
        int maxArea = 0;
        
        while(left < right){
            maxArea = Math.max(maxArea, Math.min(height[left], height[right]) * (right - left));
            
            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
        }
        
        return maxArea;
    }
}
