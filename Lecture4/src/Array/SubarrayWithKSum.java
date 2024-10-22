package Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class SubarrayWithKSum {

    public static boolean checkKSumSubarray(int[] arr, int k){       //  level 1
        int n = arr.length;
        HashSet<Integer> set = new HashSet<>();
        set.add(0);
        int sum = 0;
        for (int i=0;i<n;i++){
            sum += arr[i];
            int rem = sum - k;
            if (set.contains(rem)){
                return true;
            }
            set.add(sum);
        }
        return false;
    }
    public static ArrayList<Integer> findKSumSubarray(int[] arr, int k){      //  level 2 -> find index of subarray
        ArrayList<Integer> list = new ArrayList<>();
        list.add(-1);
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int sum = 0;
        for (int i=0;i< arr.length;i++){
            sum += arr[i];
            int rem = sum - k;
            if (map.containsKey(rem)){
                int startingIndex = map.get(rem)+1;
                list.set(0,startingIndex);
                list.add(i);
                break;
            }
            map.put(sum,i);
        }
        return list;
    }
    public static int findLongestKSumSubarray(int[] arr, int k){      //  find longest k sum sub array
        int sum = 0;
        int maxLen = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        for(int i=0;i< arr.length;i++){
            sum += arr[i];
            int rem = sum - k;
            if (map.containsKey(rem)){
                int len = i - map.get(rem);
                maxLen = Math.max(maxLen , len);
            }
            if (!map.containsKey(sum)){
                map.put(sum,i);
            }
        }
        return maxLen;
    }

    public static int findTotalKSumSubarray(int[] arr, int k) {      //  find total no. of k sum sub array
        int count = 0,sum = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for (int i=0;i< arr.length;i++){
            sum += arr[i];
            int rem = sum - k;
//            count += freqMap.getOrDefault(rem,0);
//            freqMap.put(sum,freqMap.getOrDefault(sum,0)+1);
            if (map.containsKey(rem)) {
                count += map.get(rem);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }

        public static void main(String[] args) {
        int[] arr = {2,8,2,6,-6,3,2};
        boolean found = checkKSumSubarray(arr,5);
        System.out.println(found);
    }
}
