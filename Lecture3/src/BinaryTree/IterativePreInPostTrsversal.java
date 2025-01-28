package BinaryTree;

import java.util.*;

public class IterativePreInPostTrsversal {
    public static List<Integer> Preorder(BinaryTreeNode<Integer> root){
        List<Integer> list = new ArrayList<>();
        Stack<BinaryTreeNode<Integer>> st = new Stack<>();
        if (root == null) {
            return list;
        }
        st.push(root);
        while (!st.isEmpty()){
            BinaryTreeNode<Integer> node = st.pop();
            list.add(node.data);
            if (node.right != null) {
                st.push(node.right);
            }
            if (node.left != null) {
                st.push(node.left);
            }
        }
        return list;
    }
    public static List<Integer> inorder(BinaryTreeNode<Integer> root){
        List<Integer> list = new ArrayList<>();
        Stack<BinaryTreeNode<Integer>> st = new Stack<>();
        BinaryTreeNode<Integer> node = root;

        while (!st.isEmpty() || node != null){
            //  move to the left
            while (node != null) {
                st.push(node);
                node = node.left;
            }
            // print the root
            node = st.pop();
            list.add(node.data);
            //  move to the right
            node = node.right;
        }
        return list;
    }
    public static BinaryTreeNode<Integer> postorder(BinaryTreeNode<Integer> root){
        List<Integer> list = new ArrayList<>();
        Stack<BinaryTreeNode<Integer>> st = new Stack<>();
        BinaryTreeNode<Integer> node = root;

        while (!st.isEmpty() || node != null) {
            // move to the left
            while (node != null) {
                st.push(node);
                node = node.left;
            }
            // move to the right
            if (st.peek().right != null){
                node = st.peek().right;
            } else {
                BinaryTreeNode<Integer> temp = st.pop();
                list.add(temp.data);
                while (!st.isEmpty() || temp == st.peek().right){
                    temp = st.pop();
                    list.add(temp.data);
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {

    }
}
