class Solution {
    public int numIslands(char[][] grid) {
        // edge case
        if(grid == null || grid.length == 0){
            return 0;
        }
        //logic
        int count = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == '1'){
                    dfs(grid, i, j);
                    count++;
                }
            }
        }
        
        return count;
    }
    
    private void dfs(char[][] grid, int row, int col){
        //base case
        if(row < 0 || row >= grid.length || col < 0 || col >= grid[0].length || grid[row][col] == '0'){
            return;
        }
        //logic
        grid[row][col] = '0';
        int[][] dirs = {{0,1},{0,-1},{1,0},{-1,0}};
        
        for(int[] dir : dirs){
            int i = dir[0]+row;
            int j = dir[1]+col;
            dfs(grid, i, j);
        }
    }
}
