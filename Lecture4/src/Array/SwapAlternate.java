package Array;

import java.util.Scanner;

public class SwapAlternate {
    public static int[] input() {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int input[] = new int[n];
        for (int i=0;i<=n;i++) {
            input[i] = s.nextInt();
        }
        return input;
    }
    public static void Swap(int[] input) {
        for (int i=0;i<(input.length-1);i+=2) {
            int temp = input[i];
            input[i] = input[i+1];
            input[i+1] = temp;
        }
        for (int i=0;i<=input.length;i++) {
            System.out.println(input[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = input();
        Swap(arr);

    }
}
