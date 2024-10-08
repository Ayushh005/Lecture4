package Strings;

public class SumOfDigitsOFStringAfterConvert {
    public static int convert(String s, int k) {
        int sum = 0;
        for(char i : s.toCharArray()){
            int value = i - 'a' + 1;
            while(value > 0){
                sum += value % 10;
                value/=10;
            }
        }
        while(k --> 1){
            int newSum = 0;
            while(sum > 0){
                newSum += sum % 10;
                sum /= 10;
            }
            sum = newSum;
        }
        return sum;
    }

    public static void main(String[] args) {
        String s = "ayush";
        int k = 2;
        System.out.println(convert(s, k));  // Output should be 7
    }
}
