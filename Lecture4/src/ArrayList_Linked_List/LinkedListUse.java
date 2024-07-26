package ArrayList_Linked_List;



public class LinkedListUse {
    public static void main(String[] args) {
        Node<Integer> node1 = new Node<>(10);     //  making a new node
        Node<Integer> node2 = new Node<>(20);
        Node<Integer> node3 = new Node<>(30);
        node1.next = node2;                            //  link to next node
        node2.next = node3;
        Node<Integer> head = node1;                    //  making a head node

        System.out.println("Node 1 data: " + node1.data);
        System.out.println("Node 1 next: " + node1.next);


        System.out.println("Node 1 next data: " + node1.next.data);

        while (head != null){                         //  for traversing
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
}
