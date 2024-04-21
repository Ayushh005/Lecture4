package RecursionCN;

import java.util.Scanner;


    public class FibonacciSeries {
        public static int fibonacci(int n){
            if (n==0 || n==1){
                return n;
            }
            int ans = fibonacci(n-1) + fibonacci(n-2);

            return ans;
        }

        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int n = s.nextInt();
            System.out.println(fibonacci(n));
        }
    }
