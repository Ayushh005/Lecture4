class Main{

    public static void Sort(int[] arr){
        int zero = 0;
        for (int i=0;i< arr.length-1;i++){
            if (arr[i] == 0){
                int temp = arr[zero];
                arr[zero] = arr[i];
                arr[i] = temp;
                zero++;
            }
        }
        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int input[] = {0,0,1,0,1,1,0,1};
        Sort(input);
    }
}
