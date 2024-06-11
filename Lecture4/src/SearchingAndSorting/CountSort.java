package SearchingAndSorting;

public class CountSort {
    public static void countSort(int arr[]){
        int count[] = new int[11];
        for (int i : arr){
            count[i]++;
        }
        int j = 0;
        for (int i=1;i<11;i++){
            if (count[i] != 0){
                while (count[i] > 0){
                    arr[j] = i;
                    j++;
                    count[i]--;
                }
            }
            if (j == arr.length)  break;
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,6,9,4,7,8,3,4,5,1,4,5,};
        countSort(arr);
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
