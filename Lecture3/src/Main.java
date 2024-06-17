class Main{
    public static void power(int n,int x){
        int ans = n;
        for (int i=1;i<=x;i++){
            ans*= n;
            System.out.println(ans);
        }
    }
    public static void main(String[] args) {
        int n = 4;
        int x = 3;
        power(n,x);
    }
}