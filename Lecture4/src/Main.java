import java.util.Scanner;

class Main {
    public static int diagonalSum(int[][] arr){
        int n = arr.length;
        int sum = 0;

        for (int i=0;i< arr.length;i++){
            for (int j=0;j< arr.length;j++){
                if (i == j){
                    sum += arr[i][j];
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of Matrix :");
        System.out.println();
        int n = s.nextInt();
        int[][] arr = new int[n][n];

        System.out.println("Enter elements of Matrix :");
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                arr[i][j] = s.nextInt();
            }
        }
        int ans = diagonalSum(arr);
        System.out.println("Sum of Diagonals : " + ans);
    }
}



