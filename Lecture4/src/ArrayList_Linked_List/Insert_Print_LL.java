package ArrayList_Linked_List;

import java.util.Scanner;

public class Insert_Print_LL {

    public static Node<Integer> input() {
        Node<Integer> head = null, tail = null;
        Scanner s = new Scanner(System.in);
        int data = s.nextInt();

        while (data != -1) {
            Node<Integer> newNode = new Node<>(data);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
            data = s.nextInt(); // Read the next input
        }
        return head;
    }

    public static void print(Node<Integer> head){                 //  for print
        while (head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
    public static void main(String[] args) {
        Node<Integer> node1 = new Node(10);                 //  create node
        Node<Integer> node2 = new Node<>(20);
        Node<Integer> node3 = new Node<Integer>(30);
        node1.next = node2;                                      //  link between them
        node2.next = node3;
        Node<Integer> head = node1;                              //  make head node

        print(head);
    }
}
