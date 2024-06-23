class Main{

    public static void unique(int[] arr){
        int n = arr.length;
        int res = 0;
        for (int i=0;i<n;i++){
            res = res^arr[i];
        }
        System.out.println(res);
    }
    public static void main(String[] args) {
        int arr[] = {1,1,5,5,6,7,7};
        unique(arr);
    }
}
