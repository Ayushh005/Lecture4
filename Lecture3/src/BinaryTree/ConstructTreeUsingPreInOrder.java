package BinaryTree;

public class ConstructTreeUsingPreInOrder {
    public static BinaryTreeNode<Integer> buildTreeHelper(int[] pre, int[] in,int inS,int inE,int preS,int preE){
        if (inS > inE) {
            return null;
        }
        int rootData = pre[preS];
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
        int rootInIndex = -1;
        for (int i=inS;i<=inE;i++){
            if (rootData == in[i]){
                rootInIndex = i;
                break;
            }
            if (rootInIndex == -1) {
                return null;
            }
        }
        int leftInS = inS;
        int leftInE = rootInIndex - 1;
        int leftPreS = preS + 1;
        int leftPreE = leftInE - leftInS + leftPreS;
        int rightInS = rootInIndex + 1;
        int rightInE = inE;
        int rightPreS = leftPreE + 1;
        int rightPreE = preE;

        root.left = buildTreeHelper(pre,in,leftInS,leftInE,leftPreS,leftPreE);
        root.right = buildTreeHelper(pre,in,rightInS,rightInE,rightPreS,rightPreE);

        return root;
    }
    public static void print(BinaryTreeNode<Integer> root){
        if (root == null) {
            return;
        }
        String toBePrinted = root.data + " : ";
        if (root.left != null) {
            toBePrinted = "L : "+ root.left.data + ", ";
        }
        if (root.right != null) {
            toBePrinted = "R : "+ root.right.data + ", ";
        }
        System.out.println(toBePrinted);
        print(root.left);
        print(root.right);
    }
    public static BinaryTreeNode<Integer> buildTree(int[] pre, int[] in){
        return buildTreeHelper(pre,in,0,in.length-1, 0, pre.length-1);
    }
    public static void main(String[] args) {
        int[] pre = {1,2,4,5,3,7};
        int[] in  = {4,2,5,1,3,7};

        BinaryTreeNode<Integer> root = buildTree(pre,in);
        print(root);
    }
}
