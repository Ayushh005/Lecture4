class Main{
    public static void ratInAMaze(int maze[][]){
        int n = maze.length;
        int path[][] = new int[n][n];
        solveMaze(maze,path,0,0);
    }
    public static void solveMaze(int maze[][],int path[][],int i,int j){
        int n = maze.length;
        if (i<0 || i>=n || j<0 || j>=n || maze[i][j] == 0 || path[i][j] == 1){
            return;
        }
        path[i][j] = 1;
        if (i == n-1 && j == n-1){
            for (int r=0;r<n;r++){
                for (int c=0;c<n;c++){
                    System.out.print(path[r][c]+" ");
                }
                System.out.println();
            }
            System.out.println();
            path[i][j] = 0;
            return;
        }

        solveMaze(maze, path, i-1, j);
        solveMaze(maze, path, i, j+1);
        solveMaze(maze, path, i+1, j);
        solveMaze(maze, path, i, j-1);
        //  backtrack
        path[i][j] = 0;
    }

    public static void main(String[] args) {
        int maze[][] = {{1, 1, 0}, {1, 1, 0}, {1, 1, 1}};
        ratInAMaze(maze);
    }
}
