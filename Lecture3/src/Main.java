import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your Principal Amount : ");
        int p = s.nextInt();
        System.out.print("Enter rate : ");
        int r = s.nextInt();
        System.out.print("Enter Time : ");
        int t = s.nextInt();

        int si = p*r*t/100;
        int totalAmount = p + si;
        System.out.println("Your total amount will be "+totalAmount);
    }
}