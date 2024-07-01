package Array;

public class ArrayRotateCheak {
    public static int Check(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1])
                return (i + 1);
        }
        return 0; // if no rotation point is found
    }

    public static void main(String[] args) {
        int arr[] = {4, 6, 4, 8, 3, 9, 5};
        int d = 3; // This variable is not needed for the Check method
        int rotationIndex = Check(arr);
        System.out.println("Rotation index: " + rotationIndex);
    }
}
