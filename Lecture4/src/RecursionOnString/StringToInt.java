package RecursionOnString;

public class StringToInt {
    public static int strToInt(String str){
        if (str.length() == 1){
            return str.charAt(0) - '0';
        }
        int ans = strToInt(str.substring(0,str.length()-1));

        int lastDigit = str.charAt(str.length()-1) - '0';
        return ans*10 + lastDigit;
    }
    public static void main(String[] args) {
        String str = "1234";
        System.out.println(strToInt(str));
    }
}
