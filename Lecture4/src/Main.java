class Main{
    public static boolean ratInAMaze(int maze[][]){
        int n = maze.length;
        int path[][] = new int[n][n];
        return solveMaze(maze,path,0,0);
    }
    public static boolean solveMaze(int maze[][],int path[][],int i,int j){
        int n = maze.length;
        if (i<0 || i>=n || j<0 || j>=n || maze[i][j] == 0 || path[i][j] == 1){
            return false;
        }
        path[i][j] = 1;
        if (i == n-1 && j == n-1){
            path[i][j] = 1;
            return true;
        }
        if (solveMaze(maze, path, i-1, j)){
            return true;
        }
        if (solveMaze(maze, path, i, j+1)){
            return true;
        }
        if (solveMaze(maze, path, i+1, j)){
            return true;
        }
        if (solveMaze(maze, path, i, j-1)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int maze[][] = {{1,1,0},{1,1,0},{0,1,1}};
        boolean pathPossible = ratInAMaze(maze);
        System.out.println(pathPossible);
    }
}
