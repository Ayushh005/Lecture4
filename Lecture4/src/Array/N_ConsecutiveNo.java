package Array;

public class N_ConsecutiveNo {
    public static void con(int[] arr){
        int count = 0;
        int max = 0;
        for (int i=0;i< arr.length-1;i++){
            if (arr[i] == arr[i+1]){
                count++;
            } else {
                max = Math.max(max, count);
                count = 0;
            }
        }

        if (arr[arr.length - 1] == arr[arr.length - 2]) {
            count++;
        }
        max = Math.max(max, count);
        System.out.println(max);
    }
    public static void main(String[] args) {
        int[] arr = {1,1,6,3,5,5,5,2,2,2,2};
        con(arr);
    }
}
