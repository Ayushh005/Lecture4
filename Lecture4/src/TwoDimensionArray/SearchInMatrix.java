package TwoDimensionArray;

public class SearchInMatrix {

    // Function to search for a value in a 2D matrix
    public static boolean search(int[][] arr, int x) {
        int row = arr.length;    // Number of rows
        int col = arr[0].length; // Number of columns
        int i = 0;               // Start at the first row
        int j = col - 1;         // Start at the last column

        // Loop until the indices are within the bounds of the matrix
        while (i >= 0 && i < row && j >= 0 && j < col) {
            if (arr[i][j] == x) { // If the current element is the target value
                return true;
            } else if (arr[i][j] > x) { // If the current element is larger than the target value
                j--; // Move left
            } else { // If the current element is smaller than the target value
                i++; // Move down
            }
        }
        return false; // Target value not found
    }

    public static void main(String[] args) {
        int[][] arr = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };
        int x = 60; // Target value to search for
        System.out.println(search(arr, x)); // Print the result of the search
    }
}
