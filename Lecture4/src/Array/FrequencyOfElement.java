package Array;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfElement {
    public static void countFreq(int[] arr){
        int n = arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num : arr){
            map.put(num , map.getOrDefault(num , 0)+1);
        }

        for (Map.Entry<Integer,Integer> i : map.entrySet()){
            System.out.println(i.getKey() + " occurs " + i.getValue() + " times");
        }
    }
    public static void main(String[] args) {
        int[] arr = {10, 30, 10, 20, 10, 20, 30, 10};
        countFreq(arr);
    }
}
