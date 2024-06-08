package BackTracking;

public class RatInAMaze {
    public static boolean ratInAMaze(int[][] maze){
        int n = maze.length;
        int path[][] = new int[n][n];
        return solveMaze(maze,0,0,path);
    }
    public static boolean solveMaze(int maze[][],int i,int j,int path[][]){
        //  check if i,j cell is valid or not
        int n = maze.length;
        if (i < 0 || i >= n || j < 0 || j >= n || maze[i][j] == 0 || path[i][j] == 1){
            return false;
        }

        //  Include the cell in the currrent path
        path[i][j] = 1;
        // Destination cell
        if (i == n-1 && j == n-1){
            path[i][j] = 1;
            return true;
        }
        // Explore further in all directions
        // top
        if (solveMaze(maze, i-1, j, path)){
            return  true;
        }
        // right
        if (solveMaze(maze, i, j+1, path)){
            return  true;
        }
        // down
        if (solveMaze(maze, i+1, j, path)){
            return  true;
        }
        // left
        if (solveMaze(maze, i, j-1, path)){
            return  true;
        }
        return false;
    }


    public static void main(String[] args) {
        int maze[][] = {{1,1,0},{1,1,0},{0,1,1}};
        boolean pathPossible = ratInAMaze(maze);
        System.out.println(pathPossible);
    }
}
