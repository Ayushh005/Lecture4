package BinaryTree;

public class DiameterOfTree {
    public static int diameter(BinaryTreeNode<Integer> root){                            //  bruteForce approch TC :- O(n*h) or O(n2)
        if (root == null){
            return 0;
        }
        int option1 = height(root.left) + height(root.right);
        int option2 = diameter(root.left);
        int option3 = diameter(root.right);

        return Math.max(option1 , Math.max(option2,option3));
    }

    public static int height(BinaryTreeNode<Integer> root) {
        if (root == null){
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);

        return 1 + Math.max(lh,rh);
    }
    public static Pair<Integer,Integer> diameterHeight(BinaryTreeNode<Integer> root){       //  better approach TC :- O(n)
        if (root == null){
            Pair<Integer,Integer> output = new Pair<>();
            output.first = 0;
            output.second = 0;
            return output;
        }
        Pair<Integer,Integer> leftOutput = diameterHeight(root.left);
        Pair<Integer,Integer> rightOutput = diameterHeight(root.right);
        int height = 1 + Math.max(leftOutput.first , rightOutput.second);
        int option1 = leftOutput.first + rightOutput.second;
        int option2 = leftOutput.second;
        int option3 = rightOutput.second;
        int diameter = Math.max(option1 , Math.max(option2,option3));
        Pair<Integer,Integer> output = new Pair<>();
        output.first = height;
        output.second = diameter;

        return output;
    }

    public static void main(String[] args) {

    }
}
