package Java.Tree.Genric;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class DisplayGTree {
    public static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();
    }

    static void display(Node root) {
        String s = root.data + "->";

        for (Node child : root.children) {
            s = s + child.data + ",";
        }
        System.out.println(s + ".");
        for (Node child : root.children) {
            display(child);
        }
    }

    static int maxOfTree(Node root) {
        int max1 = root.data;
        for (Node child : root.children) {
            int maxChild = maxOfTree(child);
            max1 = maxChild > max1 ? maxChild : max1;
        }
        // we can compare max of children of a node with the value of node in postorder
        // but for that we have to set max1 value to Integer.MIN_VALUE.
        return max1;
    }

    static int height(Node root) {
        // height of the tree can be calculated by couting no. of edges from root node
        // to the deepest leaf node
        // or by counting the number of nodes from root node to the deepest leaf node.
        // in case of Edges: root (without left and right subtree) will have hieght of
        // 0.
        // in case of Nodes: root .... will have height of 1.

        // height of a node is calculated by counting no. of edges or nodes from that
        // node to the deepest leaft node.
        // depth of a node is calculed by counting no. of edges or nodes from that node
        // to root node.
        // in this case root will have depth of 0(in case of Edges) and 1 (in case of
        // Nodes).

        int h = -1;
        for (Node child : root.children) {
            int childHeight = height(child);
            h = Math.max(childHeight, h);
        }
        return h + 1;
    }

    static int calculateSize(Node root) {
        // considering that tree will not be null
        int size = 0;
        for (Node child : root.children) {
            int childSize = calculateSize(child);
            size = size + childSize;
        }
        return size + 1;
    }
    // Pre-order
    // euler path: left side of the node.
    // before going deep in the tree or recursion.
    // stack size stars to increase.
    // root node is visited first before it's children

    // Post-order
    // euler path: right side of the node.
    // coming up in the tree or recursion or coming back.
    // stack size starts to decrease.
    // root node is visited after all of it's children.
    static void preOrder(Node root) {

        System.out.print(root.data + " ");
        for (Node child : root.children)
            preOrder(child);
    }

    static void pepPreOrder(Node root) {
        System.out.println("Node pre: " + root.data);
        for (Node child : root.children) {
            System.out.println("Edge pre: " + root.data + "--" + child.data);
            pepPreOrder(child);
            System.out.println("Edge post: " + root.data + "--" + child.data);
        }
        System.out.println("Node post: " + root.data);
    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, -1, 40, -1, -1, 50, 60, -1, 70, -1, 80, -1, -1, 90, 11, 4, -1, 3, -1, -1, -1 };
        ArrayDeque<Node> stack = new ArrayDeque<>();
        Node root = null;
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] == -1) {
                stack.poll();
            } else {
                Node temp = new Node();
                temp.data = arr[i];
                if (stack.size() > 0) {
                    stack.peek().children.add(temp);
                } else {
                    root = temp;
                }
                stack.push(temp);
            }
        }
        display(root);
        System.out.println("size:" + calculateSize(root));
        System.out.println("Maximum element:" + maxOfTree(root));
        System.out.println("height of the tree:" + height(root));
        System.out.print("pre-Order:");
        preOrder(root);
        System.out.println("\npre-order pep style!");
        pepPreOrder(root);
    }
}
