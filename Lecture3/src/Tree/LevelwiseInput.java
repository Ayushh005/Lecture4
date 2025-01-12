package Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class LevelwiseInput {

    public static TreeNode<Integer> takeInputLevelWise() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter root data : ");
        int rootNode = s.nextInt();

        Queue<TreeNode<Integer>> queue = new LinkedList<>();
        TreeNode<Integer> root = new TreeNode<>(rootNode);
        queue.offer(root);

        while (!queue.isEmpty()){
            TreeNode<Integer> frontNode = queue.poll();
            System.out.print("Enter no. of children of " + frontNode.data);
            int numChild = s.nextInt();
            for (int i=1;i<=numChild;i++) {
                System.out.print("Enter " + i + "th child of " + frontNode.data);
                int child = s.nextInt();
                TreeNode<Integer> childNode = new TreeNode<>(child);
                frontNode.children.add(childNode);
                queue.offer(childNode);
            }
        }
        return root;
    }
    public static void main(String[] args) {
        TreeNode<Integer> root = takeInputLevelWise();

    }
}
