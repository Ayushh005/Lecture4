package Strings;

public class ReverseString {
    public static void reverse(String str){
        char[] ch = str.toCharArray();
        int start = 0;
        int end = str.length()-1;
        while (start < end){
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            start++;
            end--;
        }
        System.out.println(ch);
    }
    public static void main(String[] args) {
        String str = "Ayush";
        reverse(str);
    }
}

//class Main {
//    public static String reverse(String str) {
//        char[] ch = str.toCharArray();
//        int s = 0;
//        int e = str.length()-1;
//        while (s <= e){
//            char temp = ch[s];
//            ch[s] = ch[e];
//            ch[e] = temp;
//            s++;e--;
//        }
//        return new String(ch);
//    }
//
//    public static void main(String[] args) {
//        String str = "racecare";
//        System.out.println(reverse(str));
//    }
//}

