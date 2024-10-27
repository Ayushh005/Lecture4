package Sliding_Window;

public class maxSum_subarr {
    public static int maxSum(int[] arr, int k){
        int n = arr.length;
        int sum = 0;
        int maxSum = 0;
        for(int i=0;i<n && i<k;i++){
            sum += arr[i];
        }
        maxSum = sum;

        for(int i=1;i <= n-k; i++){
            int windowLast = arr[i-1];
            int windowNext = arr[i+k-1];
            sum = sum - windowLast + windowNext;
            maxSum = Math.max(sum,maxSum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70};
        int k = 3;
        System.out.println(maxSum(arr,k));
    }
}
