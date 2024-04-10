package Problems.Backtracking;

class WordSearch {
    boolean visited [][];
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        visited = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (dfs(board, word, i, j, m, n, 0)) {
                    return true;
                }
            }
        }
        return false;

    }

    public boolean dfs(
            char[][] board,String word,int i,int j,int m,int n,int cur) {
        if(cur == word.length())
            return true;
        if ( i < 0 ||j < 0 ||i >= m ||j >= n ||board[i][j] != word.charAt(cur) || visited[i][j]==true)
            return false;

        visited[i][j] = true;
        boolean found =
                dfs(board,word,i+1,j,m,n,cur+1) ||
                        dfs(board,word,i-1,j,m,n,cur+1) ||
                        dfs(board,word,i,j+1,m,n,cur+1) ||
                        dfs(board,word,i,j-1,m,n,cur+1);

        visited[i][j] = false;
        return found;

    }

}


