class Main {
    public static void sort(int[] arr){
        int i = 0;
        int zero = 0;
        int two = arr.length-1;
        while (i <= two){
            if (arr[i] == 0){
                int temp = arr[i];
                arr[i] = arr[zero];
                arr[zero] = temp;
                i++;
                zero++;
            } else if (arr[i] == 2) {
                int temp = arr[i];
                arr[i] = arr[two];
                arr[two] = temp;
                two--;                   //  dont iterate i++ here because you cheak that swappwd element again
            }
            else {
                i++;
            }
        }
        for (i =0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,0,2,0,1};
        sort(arr);
    }
}



