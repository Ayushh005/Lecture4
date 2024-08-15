package ArrayList_Linked_List;

import java.util.ArrayList;

public class Basics {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>(5);         //  default 10 in size
        System.out.println(list1.size());
        list1.add(15);
        list1.add(20);
        list1.add(25);
        list1.add(2,50);    //  elements from 2 are shifted right ward and 50 is put on this place

        System.out.println(list1.size());
        System.out.println(list1.get(2));  //  used to print

        for (int i=0;i< list1.size();i++){
            System.out.print(list1.get(i)+" ");
        }
        System.out.println();

        list1.remove(1);          //  all elements shifted left ward
        list1.set(1,21);                //  used to update number

        for (int elem : list1){         //  for each loop use for traversing not perform any operation
            System.out.print(elem +" ");
        }
    }
}

//
//    list1.add(25);
//    list1.remove(25);
//    list1.get(i);  print
//    list1.size();
//    list1.set();   update

