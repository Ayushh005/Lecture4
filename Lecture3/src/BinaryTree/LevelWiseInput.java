package BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class LevelWiseInput {
    public static void printnodeWithoutSibling(BinaryTreeNode<Integer> root){
        if (root == null) {
            return;
        }
        if (root.left != null && root.right == null) {
            System.out.print(root.left.data + " ");
        } else if (root.left == null && root.right != null) {
            System.out.print(root.right.data + " ");
        }
        printnodeWithoutSibling(root.left);
        printnodeWithoutSibling(root.right);
    }
    public static boolean isPresent(BinaryTreeNode<Integer> root, int x){
        if (root == null) {
            return false;
        }
        if (root.data.equals(x)) {
            return true;
        }
        return (isPresent(root.left,x) || isPresent(root.right,x));
    }
    public static void preOrder(BinaryTreeNode<Integer> root){
        if (root == null){
            return;
        }
        preOrder(root.left);
        System.out.println(root.data + " ");
        preOrder(root.right);
    }
    public static int countNodes(BinaryTreeNode<Integer> root){
        if (root == null){
            return 0;
        }
        int count = 0;
        count += countNodes(root.left);
        count += countNodes(root.right);
        return count;
    }
    public static ArrayList<Integer> BFSprint(BinaryTreeNode<Integer> root){
        ArrayList<Integer> list = new ArrayList<>();
        Queue<BinaryTreeNode<Integer>> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            BinaryTreeNode<Integer> front = queue.poll();
            list.add(front.data);
            if (front.left != null) {
                queue.offer(front.left);
            }
            if (front.right != null) {
                queue.offer(front.right);
            }
        }
        return list;
    }
    public static BinaryTreeNode<Integer> takeLevelWiseInput() {
        Scanner s = new Scanner(System.in);
        Queue<BinaryTreeNode<Integer>> queue = new LinkedList<>();
        System.out.println("Enter root node: ");
        int rootNode = s.nextInt();
        if (rootNode == -1) {
            return null;
        }
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootNode);
        queue.offer(root);

        while (!queue.isEmpty()) {
            BinaryTreeNode<Integer> front;
            front = queue.poll();
            System.out.println("Enter left child of " + front.data);
            int leftChild = s.nextInt();
            if (leftChild != -1) {
                BinaryTreeNode<Integer> child = new BinaryTreeNode<>(leftChild);
                queue.offer(child);
                front.left = child;
            }
            System.out.println("Enter right child of " + front.data);
            int rightChild = s.nextInt();
            if (rightChild != -1) {
                BinaryTreeNode<Integer> child = new BinaryTreeNode<>(rightChild);
                queue.offer(child);
                front.right = child;
            }
        }
        return root;
    }

    public static void main(String[] args) {

        takeLevelWiseInput();

    }
}
