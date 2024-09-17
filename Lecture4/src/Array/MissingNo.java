package Array;

public class MissingNo {
    public static int findMissing(int[] arr){
        int n = arr.length;
        int expectedSum = (n * (n+1))/2;

        int sum = 0;
        for (int i=0;i< n-1;i++){
            sum += arr[i];
        }
        int ans = expectedSum - sum;
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,7,8};
        System.out.println(findMissing(arr));

    }
}
