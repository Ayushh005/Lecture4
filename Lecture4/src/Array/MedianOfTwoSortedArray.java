package Array;

public class MedianOfTwoSortedArray {
        public static double Median(int[] nums1, int[] nums2) {
            int a = nums1.length;
            int b = nums2.length;
            int n = a + b;
            int[] c = new int[n];

            int i = 0, j = 0, k = 0;

            // Merging the two arrays
            while(i < nums1.length && j < nums2.length){
                if(nums1[i] < nums2[j]){
                    c[k] = nums1[i];
                    i++;
                } else {
                    c[k] = nums2[j];
                    j++;
                }
                k++;
            }
            while(i < nums1.length){
                c[k] = nums1[i];
                i++;
                k++;
            }
            while(j < nums2.length){
                c[k] = nums2[j];
                j++;
                k++;
            }

            // Finding the median
            if(n % 2 == 1){
                return c[n / 2];
            } else {
                return (c[n / 2 - 1] + c[n / 2]) / 2.0;
            }
        }

    public static void main(String[] args) {
        int arr1[] = {1,3,4,7,11};
        int arr2[] = {2,4,6,13};

        System.out.println(Median(arr1,arr2));
    }
}
