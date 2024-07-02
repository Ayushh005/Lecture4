package SearchingAndSorting;

public class SelectionSort {
    public static void Sort(int arr[]){
        for (int i=0;i< arr.length-1;i++){
            int minIndex = i;
            for (int j=i+1;j< arr.length;j++){
                if (arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {4,3,5,1,2,6,7};
        System.out.print("Sorted Array : ");
        Sort(arr);
    }
}
