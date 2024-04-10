package Problems.Graphs;

import java.util.LinkedList;
import java.util.Queue;

class Triplet<T, U, V> {
    private T first;
    private U second;
    private V third;

    public Triplet(T first, U second, V third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }
    public V getThird() {
        return third;
    }
}

class ShortestPath {
    boolean visited[][];
    public int shortestPathBinaryMatrix(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;

        visited = new boolean [r][c];
        Queue<Triplet<Integer,Integer,Integer>> q = new LinkedList<>();
        q.add( new Triplet<>(0,0,1));
        visited[0][0] = true;

        int dr[] = {-1, -1, 0, 1, 1, 1, 0, -1};
        int dc[] = {0, 1, 1, 1, 0, -1, -1, -1};

        while(!q.isEmpty()){
            Triplet<Integer,Integer,Integer> x  = q.remove();
            if (Math.min(x.getFirst(),x.getSecond()) < 0 ||
                    Math.max(x.getFirst(),x.getSecond()) >= r ||
                    grid[x.getFirst()][x.getSecond()] == 1){
                continue;
            }
            if( x.getFirst() == r-1 && x.getSecond() == c-1)
                return x.getThird();

            for (int i = 0; i < 8; i++) {
                int newRow = x.getFirst() + dr[i];
                int newCol = x.getSecond() + dc[i];
                if(newRow >= 0 && newCol >= 0 && newRow < r && newCol < c && visited[newRow][newCol] == false){
                    q.add(new Triplet<>(newRow,newCol,x.getThird()+1));
                    visited[newRow][newCol] = true;
                }


            }
        }


        return -1;
    }
}
