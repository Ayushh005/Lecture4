import java.util.Arrays;

class Main{

    public static int[][] subSetHelper(int[] arr, int si){
        if (si == arr.length){
            int[][] output = new int[1][0];
            return output;
        }
        int smallAns[][] = subSetHelper(arr, si+1);
        int ans[][] = new int[2 * smallAns.length][];

        int k = 0;
        for (int i = 0; i < smallAns.length; i++){
            ans[k] = new int[smallAns[i].length];
            for (int j = 0; j < smallAns[i].length; j++){
                ans[k][j] = smallAns[i][j];
            }
            k++;
        }
        for (int i = 0; i < smallAns.length; i++){
            ans[k] = new int[smallAns[i].length + 1];
            ans[k][0] = arr[si];
            for (int j = 1; j <= smallAns[i].length; j++){
                ans[k][j] = smallAns[i][j - 1];
            }
            k++;
        }
        return ans;
    }

    public static void printSubsets(int[][] subsets) {
        for (int[] subset : subsets) {
            System.out.println(Arrays.toString(subset));
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 20, 15};
        int[][] subsets = subSetHelper(arr, 0);
        printSubsets(subsets);
    }
}
