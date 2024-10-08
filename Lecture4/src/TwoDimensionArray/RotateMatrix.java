package TwoDimensionArray;

public class RotateMatrix {
    public static void rotate(int[][] arr){
        int n = arr.length;

        for (int i=0;i<n;i++){               //   step 1 -> transpose the matrix
            for (int j=i+1;j< n;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        for(int i=0;i<n;i++){               // step 2 -> for reversing
            int left = 0;
            int right = arr.length-1;

            while(left < right){
                int temp = arr[i][left];
                arr[i][left] = arr[i][right];
                arr[i][right]= temp;
                left++;
                right--;
            }
        }
    }
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        rotate(arr);

        // Print the rotated matrix
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}


//for (int i = 0; i < n; i++) {                        //  reversing
//        for (int j = 0; j < n / 2; j++) {
//        int temp = arr[i][j];
//        arr[i][j] = arr[i][n - 1 - j];
//        arr[i][n - 1 - j] = temp;
//        }
//        }