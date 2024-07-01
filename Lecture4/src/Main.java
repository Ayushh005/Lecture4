class Main{

    public static void Sort(int[] arr){
        int n = arr.length;
        int nonZero = 0;
        for (int i=0;i< arr.length;i++){
            if (arr[i] != 0){
                int temp = arr[nonZero];
                arr[nonZero] = arr[i];
                arr[i] = temp;
                nonZero++;
            }
        }
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {0,3,0,2,0};
        Sort(arr);
    }
}
