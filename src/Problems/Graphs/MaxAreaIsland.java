package Problems.Graphs;

class MaxAreaIsland {
    public int maxAreaOfIsland(int[][] grid) {
        int max = 0;
        int r = grid.length;
        int c = grid[0].length;
        for (int i = 0; i<r;i++){
            for(int j = 0;j<c;j++){

                int area = dfs(grid,i,j,r,c);
                max =Math.max(max,area);

            }
        }

        return max;
    }

    public int dfs(int[][] grid,int i, int j , int r, int c){

        if (i<0 || j<0 || i>=r || j >= c || grid[i][j] == 0){
            return 0;
        }
        grid[i][j] = 0;

        int area = 1 +
                dfs(grid,i+1,j,r,c) +
                dfs(grid,i-1,j,r,c) +
                dfs(grid,i,j+1,r,c) +
                dfs(grid,i,j-1,r,c) ;

        return area;
    }
}
