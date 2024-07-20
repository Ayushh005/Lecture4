class Main {
    public static String reverse(String str) {
        String[] words = str.split(" ");
        int s = 0;
        int e = words.length-1;
        while (s<e){
            String temp = words[s];
            words[s] = words[e];
            words[e] = temp;
            s++;e--;
        }
        return String.join(" ",words);
    }

    public static void main(String[] args) {
        String str = "This is Ayush Sarraf";
        System.out.println(reverse(str));
    }
}



