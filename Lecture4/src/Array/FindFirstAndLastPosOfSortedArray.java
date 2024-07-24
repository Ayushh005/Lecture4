package Array;

public class FindFirstAndLastPosOfSortedArray {
    public static void find(int arr[], int x){
        int n = arr.length;
        int i;
        int ans[] = new int[2];
        ans[0] = -1;
        ans[1] = -1;
        for (i=0;i<n;i++){
            if (arr[i] == x){
                arr[0] = i;
                break;
            }
        }
        for (int j=i;j<arr.length-1;j++){
            if (arr[j] == x){
                arr[1] = j;
                break;
            }
        }
        for (i=0;i<2;i++){
            System.out.print(ans[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,7,7,8,8,10};
        int target = 8;

        find(arr,target);

    }
}
