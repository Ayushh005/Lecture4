class Main {
    public static String reverse(String str) {
        char[] ch = str.toCharArray();
        int s = 0;
        int e = str.length()-1;
        while (s <= e){
            char temp = ch[s];
            ch[s] = ch[e];
            ch[e] = temp;
            s++;e--;
        }
        return new String(ch);
    }

    public static void main(String[] args) {
        String str = "racecare";
        System.out.println(reverse(str));
    }
}



