package RecursionOnString;

public class RemoveDuplicate {
    public static String remove(String str){
        if (str.length() <= 1){
            return str;
        }
        if (str.charAt(0) == str.charAt(1)){
            return remove(str.substring(1));
        }
            String smallAns = remove(str.substring(1));
            return str.charAt(0) + smallAns;
    }
    public static void main(String[] args) {
        String str = "xxxyyyzwwzzz";
        System.out.println(remove(str));
    }
}
