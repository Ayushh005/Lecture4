package RecursionCN;

import java.util.Scanner;

public class DigitCount {
    public static int count(int n){
        if (n == 0) {
            return 0;
        }
        int ans = count(n/10);

        return ans+1;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(count(n));
    }
}
