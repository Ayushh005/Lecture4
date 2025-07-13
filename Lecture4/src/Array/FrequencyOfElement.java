package Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencyOfElement {

    public static ArrayList<String> count(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<String> list = new ArrayList<>();

        for(int i : arr){
            map.put(i , map.getOrDefault(i , 0)+1);
        }

        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            list.add(entry.getKey() + " occurs " + entry.getValue() + " times");
        }
        return list;
    }
    public static void countFreq(int[] arr){
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

        List<String> list = count(arr);

        for(String i : list){
            System.out.println(i);
        }
    }
}
