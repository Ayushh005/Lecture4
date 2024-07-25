package Pattern2;

import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args) {
        System.out.print("Pattern Size = ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for (int i=1;i<=n;i++) {

            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            for (int j=1;j<=i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //  second part
        for (int i=n-1;i>=1;i--) {

            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            for (int j=1;j<=i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

//        int firsthalf = (n + 1) / 2;
//        int secondhalf = (n / 2);
//
//        int i = 1;
//        while (i <= firsthalf) {
//            int space = 1;
//            while (space <= firsthalf - i) {
//                System.out.print(" ");
//                space++;
//            }
//            int j = 1;
//            while (j <= (2 * i) - 1) {
//                System.out.print("*");
//                j++;
//            }
//            System.out.println();
//            i++;
//        }
//            //   Second half
//
//            i = secondhalf;
//
//            while (i >= 1) {
//                int space = 1;
//                while (space <= (secondhalf - i + 1)) {
//                    System.out.print(" ");
//                    space++;
//                }
//                int j = 1;
//                while (j <= (2 * i) - 1) {
//                    System.out.print("*");
//                    j++;
//                }
//                System.out.println();
//                i--;
//            }
        }
    }

