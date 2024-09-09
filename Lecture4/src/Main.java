class Main {
    public static double power(double a, int n){
        if(n == 0){
            return 1;
        }
        if (n<0){
            n = -n;
            a = 1/a;
        }
        double ans = power(a,n/2);
        if (n%2 == 0){
            return ans * ans;
        }
        else{
            return ans * ans * a;
        }
    }
    public static void main(String[] args) {
        int a = 2;
        int n = -2;
        System.out.println(power(a,n));
    }
}



