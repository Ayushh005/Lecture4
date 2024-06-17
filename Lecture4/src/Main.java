class Main{

    public static int power(int a,int n){
        if (n==1){
            return n;
        }
        int ans = power(a,n-1);

        return ans * a;
    }
    public static void main(String[] args) {
        int a = 4;
        int n = 5;
        System.out.println(power(a,n));
    }
}
