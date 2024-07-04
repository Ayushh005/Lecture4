package TwoDimensionArray;

public class SearchInMatrix {
    public static boolean search(int[][] arr,int x){
        int i = 0;
        int row = arr.length;
        int col = arr[0].length;
        int j = col-1;

        while (i>=0 && i<row && j>=0 && j<col){
            if (arr[i][j] == x){
                return true;
            }
            else if(arr[i][j] > x){
                j--;
            }
            else if(arr[i][j] < x){
                i++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[][] = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int x = 60;
        System.out.println(search(arr,x));
    }
}
