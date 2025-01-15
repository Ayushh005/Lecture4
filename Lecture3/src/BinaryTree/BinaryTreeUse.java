package BinaryTree;

import java.util.Scanner;

public class BinaryTreeUse {
    public static void print(BinaryTreeNode<Integer> root){
        if (root == null){
            return;
        }
        String tobePrinted = root.data + " : ";
        if (root.left != null){
            tobePrinted = "L : "+root.left.data + ",";
        }
        if (root.right != null){
            tobePrinted = "R : " + root.right.data + ",";
        }
        System.out.println(tobePrinted);
        print(root.left);
        print(root.right);
    }
    public static BinaryTreeNode<Integer> takeInput(Scanner s){
        int rootNode;
        System.out.println("Enter root data : ");
        rootNode = s.nextInt();
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootNode);
        root.left = takeInput(s);
        root.right = takeInput(s);
        return root;
    }
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(1);
        BinaryTreeNode<Integer> node1 = new BinaryTreeNode<>(2);
        root.left = node1;
        BinaryTreeNode<Integer> node2 = new BinaryTreeNode<>(3);
        root.right = node2;
    }
}
