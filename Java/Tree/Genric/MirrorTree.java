package Java.Tree.Genric;

import java.util.ArrayDeque;
import java.util.Collections;

public class MirrorTree {
    static void mirrorTree(Node root) {
        for (Node child : root.children) {
            mirrorTree(child);
        }
        Collections.reverse(root.children);
    }

    static boolean findTarget(Node root, int target) {
        if (root.data == target)
            return true;
        for (Node child : root.children) {
            if (findTarget(child, target))
                return true;
        }
        return false;
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
        mirrorTree(root);
        LinewiseZigZag.levelOrder(root);
        System.out.println(findTarget(root, 3));
    }
}