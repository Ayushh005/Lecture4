package BinaryTree;

public class PrintNodeAtDepthK {
    public static void printNodeAtDepthK(BinaryTreeNode<Integer> root,int k){
        if (root == null) {
            return;
        }
        if (k == 0){
            System.out.println(root.data + " ");
        }
        printNodeAtDepthK(root,k-1);
        printNodeAtDepthK(root,k-1);
    }
    public static void main(String[] args) {

    }
}
