package LinkedList;

import java.util.ArrayList;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        System.out.println(list1.size());
        list1.add(15);     // add new value in the list
        list1.add(20);
        list1.add(2,50);
        list1.add(25);
        System.out.print(list1.get(2)+" ");   // traverse data from list

        for (int i=0;i< list1.size();i++){
            System.out.println(list1.get(i));
        }

        list1.remove(1);  // remove value from the list
        list1.set(1,50);    // update the existing value
        System.out.println();
        for (int i=0;i< list1.size();i++){
            System.out.print(list1.get(i)+" ");
        }

    }
}
