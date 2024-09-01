class Main {
    public static int sum(int n){
        if (n == 0){
            return 0;
        }
        int temp = sum(n-1);
        return temp + n;
    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println(sum(n));;
    }
}



