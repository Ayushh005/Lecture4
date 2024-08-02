package ArrayList_Linked_List;

public class RemoveElement {
    public static Node removeElement(Node head,int val){
        while (head != null && head.val == val){

        }
    }
    public static void main(String[] args) {
        Node<Integer> node1 = new Node(10);                 //  create node
        Node<Integer> node2 = new Node<>(20);
        Node<Integer> node3 = new Node<Integer>(30);
        Node<Integer> node4 = new Node<>(40);
        node1.next = node2;                                      //  link between them
        node2.next = node3;
        node3.next = node4;
        Node<Integer> head = node1;
        int val = 30;

        removeElement(head,val);
    }
}
