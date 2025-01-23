package BinaryTree;

public class MirrorTree {
    public static BinaryTreeNode<Integer> mirror(BinaryTreeNode<Integer> root){
        if (root == null) {
            return null;
        }
        mirror(root.left);
        mirror(root.right);

        BinaryTreeNode<Integer> temp = root.left;
        root.left = root.right;
        root.right = temp;

        return root;
    }
    public static void main(String[] args) {

    }
}
