class Main {
    public static void find(int[] arr) {
        int n = arr.length;
        int count = 0;
        int max = 0;
        for (int i=0;i<n;i++){
            if (arr[i] == 1){
                count++;
            }
            else {
                count = 0;
            }
            max = Math.max(count,max);
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        int[] arr = {1,1,0,1,0,1,1,1,1,0,1,0,1,1};
        find(arr);
    }
}





//   for(int i=0;i<n;i++){               // for reversing
//        int left = 0;
//        int right = matrix.length-1;
//
//        while(left < right){
//        int temp = matrix[i][left];
//        matrix[i][left] = matrix[i][right];
//        matrix[i][right]= temp;
//        left++;
//        right--;
//        }
//        }
