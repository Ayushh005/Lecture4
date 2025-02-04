package BST;

import BinaryTree.BinaryTreeNode;

public class PrintInRange {
    public void k1k2Range(BinaryTreeNode<Integer> root, int k1,int k2){
        if (root == null) {
            return;
        }
        if (root.data >= k1 && root.data <= k2){
            k1k2Range(root.left,k1,k2);
            System.out.println(root.data + " ");
            k1k2Range(root.right,k1,k2);
        }
        else if(root.data < k1){
            k1k2Range(root.right,k1,k2);
        }
        else {
            k1k2Range(root.left,k1,k2);
        }
    }
    public static void main(String[] args) {

    }
}
