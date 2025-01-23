package BinaryTree;

public class RemoveLeaafNode {
    public static BinaryTreeNode<Integer> removeLeaf(BinaryTreeNode<Integer> root){
        if (root == null) {
            return null;
        }
        if (root.left == null && root.right == null) {
            return null;
        }
        root.left = removeLeaf(root.left);
        root.right = removeLeaf(root.right);
        return root;
    }
    public static void main(String[] args) {

    }
}
