class Solution {
    public int numIslands(char[][] grid) {
        //edge case
        
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
    
    private void dfs(char[][] grid, int i, int j){
        //base case
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == '0'){
            return;
        }
        //logic
        grid[i][j] = '0';
        int[][] direction = {{1,0},{-1,0},{0,-1},{0,1}};
        
        for(int[] dir : direction){
            int row = i + dir[0];
            int col = j + dir[1];
            dfs(grid, row, col);
        }
    }
}
