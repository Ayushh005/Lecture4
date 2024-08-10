package Array;

import java.util.Arrays;

public class ThreeSumClosesest {
    public static int closestSum(int[] arr,int x){
        int n = arr.length;
        Arrays.sort(arr);
        int closestSum = arr[0] + arr[1] + arr[n-1];
        for (int i=0;i<n-2;i++){
            int s = i+1;
            int e = n-1;
            while (s < e){
                int currSum = arr[i] + arr[s] + arr[e];
                if (currSum < x){
                    e--;
                }else{
                    s++;
                }
                if (Math.abs(currSum - x) < Math.abs(closestSum - x)){
                    closestSum = currSum;
                }
            }
        }
        return closestSum;
    }
    public static void main(String[] args) {
        int[] arr = {-1,2,1,-4};
        int x = 1;
        System.out.println(closestSum(arr,x));
    }
}
