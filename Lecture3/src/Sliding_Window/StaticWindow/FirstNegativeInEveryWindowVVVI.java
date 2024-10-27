package Sliding_Window.StaticWindow;

import java.util.LinkedList;
import java.util.Queue;

public class FirstNegativeInEveryWindowVVVI {
    public static int[] findNegative(int[] arr,int k){
        int n = arr.length;
        Queue<Integer> queue = new LinkedList<>();
        int i=0;
        while (i < k){
            if (arr[i] < 0){
                queue.offer(arr[i]);
            }
            i++;
        }
        int[] ans = new int[n-k+1];
        ans[0] = (queue.isEmpty())?0: queue.peek();

        for (i=1;i<n-k+1;i++){
            //  remove
            if (arr[i-1] < 0){
                queue.poll();
            }
            //  add
            if (arr[i+k-1] < 0){
                queue.offer(arr[i+k-1]);
            }
            ans[i] = (queue.isEmpty())?0: queue.peek();
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
