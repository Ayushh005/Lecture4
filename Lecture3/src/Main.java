import java.util.LinkedList;
import java.util.Queue;

class Main{

        public static int[] findNegative(int[] arr, int k){
            int n = arr.length;
            Queue<Integer> queue = new LinkedList<>();

            for (int i=0;i<k;i++){
                if (arr[i] < 0){
                    queue.offer(arr[i]);
                }
            }
            int[] ans = new int[n-k+1];
            ans[0] = (queue.isEmpty())?0: queue.peek();

            for (int i=1;i<n-k+1;i++){
                if (arr[i-1] < 0){
                    queue.poll();
                }
                if (arr[i+k-1] < 0){
                    queue.offer(arr[i+k-1]);
                }
                ans[i] = (queue.isEmpty()?0: queue.peek());
            }
            return ans;
        }
        public static void main(String[] args) {
            int[] arr = {-8, 2, 3, -6, 10};                      // Output: [-8, 0, -6, -6]
            int k = 2;
            int[] result = findNegative(arr,k);

            for (int i=0;i< result.length;i++){
                System.out.print(result[i]+" ");
            }
        }
}