class Main {
    public static int fact(int n){
        if (n == 1){
            return 1;
        }
        int temp = fact(n-1);
        return temp * n;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fact(n));;
    }
}



