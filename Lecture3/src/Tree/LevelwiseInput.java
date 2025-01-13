package Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class LevelwiseInput {
    public static int countLeaf(TreeNode<Integer> root){
        if (root == null) return 0;
        if (root.children == null || root.children.size() == 0){
            return 1;
        }
        int count = 1;
        for (int i=0; i<root.children.size(); i++){
            count += countLeaf(root.children.get(i));
        }
        return count;
    }
    public static int findHeight(TreeNode<Integer> root){
        if (root == null) return 0;
        int height = 0;
        for (int i=0; i<root.children.size(); i++){
            height = Math.max(height , findHeight(root.children.get(i)));
        }
        return height + 1;
    }

    public static void depthofK(TreeNode<Integer> root, int k){
        if (k < 0) return;
        if (k == 0){
            System.out.println(root.data);
            return;
        }
        for (int i=0; i<root.children.size(); i++){
            depthofK(root.children.get(i), k-1);
        }
    }
    public static int largestNode(TreeNode<Integer> root){
        if (root == null){
            return Integer.MIN_VALUE;
        }
        int largest = root.data;
        for (int i=0; i<root.children.size(); i++){
            int child = largestNode(root.children.get(i));
            if (child > largest){
                largest = child;
            }
        }
        return largest;
    }

    public static int countNodes(TreeNode<Integer> root){
        int count = 1;
        for (int i=0; i<root.children.size(); i++){
            count += countNodes(root.children.get(i));
        }
        return count;
    }

    public static TreeNode<Integer> takeInputLevelWise() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter root data : ");
        int rootNode = s.nextInt();

        Queue<TreeNode<Integer>> queue = new LinkedList<>();
        TreeNode<Integer> root = new TreeNode<>(rootNode);
        queue.offer(root);

        while (!queue.isEmpty()){
            TreeNode<Integer> frontNode = queue.poll();
            System.out.print("Enter no. of children of " + frontNode.data + " : ");
            int numChild = s.nextInt();
            for (int i=1;i<=numChild;i++) {
                System.out.print("Enter " + i + "th child of " + frontNode.data + " : ");
                int child = s.nextInt();
                TreeNode<Integer> childNode = new TreeNode<>(child);
                frontNode.children.add(childNode);
                queue.offer(childNode);
            }
        }
        return root;
    }
    public static void print(TreeNode<Integer> root){
        String s = root.data + " : ";
        for (int i=0; i<root.children.size(); i++){
            s = s + root.children.get(i);
        }
        System.out.println(s);
        for (int i=0; i<root.children.size(); i++){
            print(root.children.get(i));
        }
    }
    public static void main(String[] args) {
        TreeNode<Integer> root = takeInputLevelWise();
        print(root);
        System.out.println(largestNode(root));
        System.out.println(countNodes(root));

    }
}
