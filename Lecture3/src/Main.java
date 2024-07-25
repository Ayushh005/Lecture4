class Main{

    public static void main(String[] args) {
        int n = 4;

        int i=1;
        while (i<=n){
            int j=1;
            while (j<=n-i){
                System.out.print(" ");
                j++;
            }
            while (j<=n){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}