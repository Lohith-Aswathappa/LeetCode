class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //edge case
//         if(m == 0){
            
//         }
        //logic
        int end = nums1.length - 1;
        
        while(m > 0 && n > 0){
            if(nums1[m-1] > nums2[n-1]){
                nums1[end] = nums1[m-1];
                m--;
            }else{
                nums1[end] = nums2[n-1];
                n--;
            }
            end--;
        }
        
        while(m > 0){
            nums1[end] = nums1[m-1];
            m--;
            end--;
        }
        
        while(n > 0){
            nums1[end] = nums2[n-1];
            n--;
            end--;
        }
        //System.arraycopy(nums2, 0, nums1, 0, n+1);
    }
}
