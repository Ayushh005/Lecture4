package SearchingAndSorting;

public class CountingSort {
    public static void countSort(int[] arr){
        // find maximum element in the array to determine the range of counts
        int max = Integer.MIN_VALUE;
        for (int i : arr){
            if (i > max){
                max = i;
            }
        }

        //  create the count array to store the count of each unique object
        int count[] = new int[max + 1];

        // store the count of each element
        for (int i : arr){
            count[i]++;
        }

        // place the element in the sorted order into the original array
        int j = 0;
        for (int i=0;i <= max;i++){
            while(count[i] > 0){
                arr[j++] = i;
                count[i]--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {5, 6, 9, 4, 7, 8, 3, 4, 5, 1, 4, 5};
        countSort(arr);

        // Print the sorted array
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
