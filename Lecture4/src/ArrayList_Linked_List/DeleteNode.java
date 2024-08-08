package ArrayList_Linked_List;

import java.util.Iterator;
import java.util.LinkedList;

public class DeleteNode {
    public static void delete(LinkedList<Integer> node, int x){
        Iterator<Integer> iterator = node.iterator();
        while (iterator.hasNext()){
            if (iterator.next() == x){
                iterator.remove();
                break;
            }
        }
    }
    public static void print(LinkedList<Integer> node){
        for (int i = 0;i<node.size();i++){
            System.out.print(node.get(i) + " ");
        }
        System.out.println();
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
        delete(ll,x);
        print(ll);
    }
}
