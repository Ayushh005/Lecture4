class Main {
    public static boolean isSorted(int[] arr,int i){
        for (i=1;i< arr.length;i++){
            if (arr[i] > arr[i-1]){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3};
        int i = 0;
        System.out.println(isSorted(arr,i));
    }
}



