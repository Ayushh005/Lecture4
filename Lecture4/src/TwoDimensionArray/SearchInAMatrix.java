package TwoDimensionArray;

public class SearchInAMatrix {
    public static boolean search(int[][] arr,int x){
        int n = arr.length;
        int m = arr[0].length;
        int low = 0;
        int high = n*m-1;

        while (low <= high){
            int mid = low + (high - low) / 2;
            int row = mid / m;
            int col = mid % m;
            if (arr[row][col] == x){
                return true;
            }
            else if (arr[row][col] < x){
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int x = 1;
        System.out.println(search(arr,x));
    }
}
