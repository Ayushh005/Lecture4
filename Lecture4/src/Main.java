class Main {
    public static String compress(String str){
        int n = str.length();
        StringBuilder ans = new StringBuilder();
        ans.append(str.charAt(0));
        for(int i=1;i<n;i++){
        if(str.charAt(i) != str.charAt(i-1)){
            ans.append(str.charAt(i));
        }
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        String str = "aabbbcddeeefggh";
        System.out.println(compress(str));
    }
}



