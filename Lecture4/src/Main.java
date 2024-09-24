class Main {
    public static void rotate(int[] arr){
        int n = arr.length;
        int s = 0;
        int e = n-1;
        while (s < e){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }
    public static void main(String[] args) {
        int [] arr = new int[]{1,2,3,4,5};
        System.out.println("Original Array:");
        for (int i=0;i< arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
        rotate(arr);
        System.out.println();
        System.out.println("Array in Reverse Order:");
        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}



