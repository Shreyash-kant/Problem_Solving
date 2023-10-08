package Java.BinaryTree;

import java.util.ArrayDeque;
import java.util.Deque;

public class Binarytree {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node() {

        }

        Node(int val, Node left, Node right) {
            this.data = val;
            this.left = left;
            this.right = right;
        }
    }

    public static class Pair {
        int state;
        Node node;

        Pair(Node node, int state) {
            this.state = state;
            this.node = node;
        }
    }

    static void displayBinaryTree(Node root) {
        if (root == null)
            return;
        System.out.print(root.data + " ");
        if (root.left != null)
            displayBinaryTree(root.left);
        if (root.right != null)
            displayBinaryTree(root.right);
    }

    public static void main(String[] args) {
        Integer[] arr = { 50, 25, 12, null, null, 37, 30, null, null, null, 75, 62, null, 70, null, null, 87, null,
                null };
        Node root = new Node(arr[0], null, null);
        Pair p1 = new Pair(root, 1);
        Deque<Pair> stack = new ArrayDeque<>();
        stack.addFirst(p1);
        // we are denoting 1->add as the left node 2-> add as the right node 3->pop the
        // node
        int indx = 1;
        while (!stack.isEmpty()) {
            Pair top = stack.getFirst();
            if (top.state == 1) {
                if (arr[indx] != null) {
                    top.node.left = new Node(arr[indx], null, null);
                    Pair temPair = new Pair(top.node.left, 1);
                    stack.addFirst(temPair);
                } else {
                    top.node.left = null;
                }
                top.state += 1;
                ++indx;
            } else if (top.state == 2) {
                if (arr[indx] != null) {
                    top.node.right = new Node(arr[indx], null, null);
                    Pair temPair = new Pair(top.node.right, 1);
                    stack.addFirst(temPair);
                } else {
                    top.node.right = null;
                }
                top.state += 1;
                ++indx;
            } else {
                stack.removeFirst();
            }
        }
        // tree is constructed
        displayBinaryTree(root);

    }
}
