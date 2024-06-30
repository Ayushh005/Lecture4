class Main{

    public static void Dublicate(int[] arr){
        int n = arr.length;
        for (int i=0;i<n-1;i++){
            for (int j=i+1;j<n;j++){
                if (arr[i] == arr[j]){
                    System.out.println(arr[i]);
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 4, 4, 5};
        System.out.print("Given Array : ");
        for (int i : arr){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.print("Dublicate element: ");
        Dublicate(arr);
    }
}
