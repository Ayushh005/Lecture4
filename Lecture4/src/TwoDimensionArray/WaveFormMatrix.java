package TwoDimensionArray;

import java.util.Scanner;

public class WaveFormMatrix {

    public static void main(String[] args) {             //   solve the error
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int n = s.nextInt();
        int[][] arr =   new int[m][n];

        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                arr[m][n] = s.nextInt();
            }
        }

        for (int i=0;i<m;i++){
            if (i%2==0){
                for (int j=0;j<n;j++){
                    System.out.println(arr[m][n]+" ");
                }
            }
            else {
                for (int j=n-1;j>=0;j--){
                    System.out.println(arr[i][j]+" ");
                }
            }
        }
    }

    
}
