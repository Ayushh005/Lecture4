//package RecursionOnString;
//
//public class SubSets {
//    public static int[][] subSetHelper(int arr[], int si){
//        if (si == arr.length){
//            int ans[][] = new int[1][0];
//            return ans;
//        }
//        int[][] smallAns = subSetHelper(arr, si+1);
//        int[][] ans = new int[2* smallAns.length][];
//
//        int k = 0;
//        for (int i=0;i< smallAns[i].length;i++){
//            ans[k] = new int[smallAns[i].length];
//            for (int j=0;j< smallAns[i].length;j++){
//                ans[k][j] = smallAns[i][j];
//            }
//            k++;
//        }
//        for (int i=0;i< smallAns[].length;i++){
//
//        }
//
//    }
//
//    public static void main(String[] args) {
//        int[] arr = {12, 20, 15};
//        int[][] subsets = subSetHelper(arr, 0);
//        subSetHelper(subsets);
//    }
//}
