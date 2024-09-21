class Main {
    public static int con(int[] arr){
        int n = arr.length;
        int count = 0;
        int max = 0;
        for (int i=1;i<n;i++){
            if (arr[i] == arr[i-1]){
                count++;
            } else {
                max = Math.max(max , count);
                count = 0;
            }
        }
        if (arr[n-1] == arr[n-2]) {
            count++;
        }
        max = Math.max(max, count);
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,6,3,5,5,5,2,2,2,2};
        System.out.println(con(arr));
    }
}



