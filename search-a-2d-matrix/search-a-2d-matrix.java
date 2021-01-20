//Brute force approach

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //edge case
        if(matrix == null || matrix.length == 0){
            return false;
        }
        //logic
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == target){
                    return true;
                }
            }
        }
        
        return false;
    }
}


//optimized binary search approach

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //edge case
        if(matrix == null || matrix.length == 0){
            return false;
        }
        //logic
        int start = 0;
        int n = matrix[0].length;
        int end = matrix.length * matrix[0].length - 1;
        
        while(start <= end){
            int mid = start + (end - start)/2;
            
            int row = mid / n;
            int col = mid % n;
            
            if(matrix[row][col] == target){
                return true;
            }
            
            if(matrix[row][col] < target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        
        return false;
    }
}
