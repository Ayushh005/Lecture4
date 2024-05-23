package RecursionOnString;

public class PairStar {
    public static String pair(String str){
        if (str.length() <= 1) {
            return str;
        }
        String out = pair(str.substring(1));

        if (str.charAt(0) == str.charAt(1)){
            out = str.charAt(0) + "*" + str.charAt(1) + out.substring(1);
        }
        else {
            out = str.charAt(0) + out;
        }
        return out;
    }
    public static void main(String[] args) {
        String s = "hello";
        System.out.println(pair(s));
    }
}
