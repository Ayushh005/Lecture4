package ArrayList_Linked_List;

import java.util.Scanner;

public class LLUsingFunction {
    public static Node<Integer> takeInput(){
        Node<Integer> head = null, tail = null;
        Scanner s = new Scanner(System.in);
        int data = s.nextInt();

        while (data != -1){
            Node<Integer> newNode = new Node<Integer>(data);
            if (head == null){
                head = newNode;
                tail = newNode;
            }
            else {
//                Node<Integer> temp = head;
//                while (temp.next != null){
//                    temp = temp.next;
//                }
//                temp.next = newNode;
                tail.next = newNode;                   //  saves much time complexity with maintain tail node
                tail = newNode;  //  tail = tial.next
            }
            data = s.nextInt();
        }
        return head;
    }
    public static void print(Node<Integer> head){
        Node<Integer> temp = head;                     //  store head to temp for further traversing
        while (head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
        head = temp;
        while (head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
    public static void main(String[] args) {
//        Node<Integer> node1 = new Node<>(10);
//        Node<Integer> node2 = new Node<>(20);
//        Node<Integer> node3 = new Node<>(30);
//        Node<Integer> node4 = new Node<>(40);
//        Node<Integer> node4 = new Node<>(40);
//        node1.next = node2;
//        node2.next = node3;
//        node3.next = node4;
//        Node<Integer> head = node1;                     //  making first node head
        Node<Integer> head = takeInput();
        print(head);
    }
}
