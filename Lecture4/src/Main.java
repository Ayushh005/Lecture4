class Main {
    public static void removeDuplicates(int[] arr) {
        if (arr.length <= 2) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            return;
        }

        int j = 2;
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] != arr[j - 2]) {
                arr[j++] = arr[i];
            }
        }
        for (int i = 0; i < j; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 2, 3};
        removeDuplicates(arr);
    }
}
