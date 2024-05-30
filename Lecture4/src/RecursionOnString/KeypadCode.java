package RecursionOnString;

public class KeypadCode {
    public static String[] singleDigit(int n){
        if (n<=1 || n>10){
            System.exit(0);
        }
        if (n == 2) {
            String output[] = {"a","b","c",};
            return output;
        }
        else if (n == 2) {
            String output[] = {"d","e","f",};
            return output;
        }
        else if (n == 4) {
            String output[] = {"g","h","i"};
            return output;
        }
        else if (n == 5) {
            String output[] = {"j","k","l"};
            return output;
        }
        else if (n == 6) {
            String output[] = {"m","n","o"};
            return output;
        }
        else if (n == 7) {
            String output[] = {"p","q","r","s"};
            return output;
        }
        else if (n == 8) {
            String output[] = {"t","u","v"};
            return output;
        }
        else {
            String output[] = {"w","x","y","z"};
            return output;
        }
    }
    public static String[] keypad(int n){
        if (n == 0) {
            String ans[] = {""};
            return ans;
        }
        String smallNum[] = keypad(n/10);
        String singleDigit[] = singleDigit(n%10);
        String[] output = smallNum[i] + singleDigit[i]


    }
    public static void main(String[] args) {
        int n = 23;
        String[] result = keypad(n);
        for (String s : result){
            System.out.println(s);
        }
    }
}
