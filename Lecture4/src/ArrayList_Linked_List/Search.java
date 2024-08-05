package ArrayList_Linked_List;

import java.util.LinkedList;

public class Search {
    public static int search(LinkedList<Integer> list, int x) {
        if (list == null) {
            return -1;
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(x)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        ll.add(6);
        ll.add(7);

        int x = 4;
        int index = search(ll, x);

        if (index != -1) {
            System.out.println("Element " + x + " found at index: " + index);
        } else {
            System.out.println("Element " + x + " not found in the list.");
        }
    }
}

//    public static int search(LinkedList<Integer> head, int x){
//        if (head == null){
//            return -1;
//        }
//        int i = 0;
//        while (head != null){
//            if (head.data.equals(x)){
//                return i;
//            }
//            head = head.next;
//            i++;
//        }
//        return -1;
//    }
