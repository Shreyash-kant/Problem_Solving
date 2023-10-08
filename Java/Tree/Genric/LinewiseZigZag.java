package Java.Tree.Genric;

import java.util.ArrayDeque;

import java.util.Deque;

public class LinewiseZigZag {

    // here we are maintaining two stack
    // first is for parent
    // second is for children
    // when parent stack becomes empty the , that means we are moving to next level
    // that is why children stack becomes parent and children stack is reinitialized
    // with empty stack
    static void zigZagOrder(Node root) {
        Deque<Node> parentStack = new ArrayDeque<>();
        Deque<Node> childStack = new ArrayDeque<>();
        int order = 1;
        parentStack.addFirst(root);
        while (!parentStack.isEmpty()) {
            Node temp = parentStack.removeFirst();
            System.out.print(temp.data + " ");
            if (order % 2 == 1)
                for (int i = 0; i < temp.children.size(); ++i) {
                    childStack.addFirst(temp.children.get(i));
                }
            if (order % 2 == 0)
                for (int i = temp.children.size() - 1; i >= 0; --i) {
                    childStack.addFirst(temp.children.get(i));
                }
            if (parentStack.isEmpty()) {
                parentStack = childStack;
                childStack = new ArrayDeque<Node>();
                order++;
                System.out.println();
            }
        }

    }

    // another way of performing the same operation with only one queue and to track
    // the next level
    // we need to have some sort of a value to store in queue that indicate the next
    // level
    // by doing so we can print normal level order and zig-zag order as well.
    static void levelOrder(Node root) {
        Deque<Node> qu = new ArrayDeque<>();
        qu.add(root);
        qu.add(new Node(-1));
        while (!qu.isEmpty()) {
            Node temp = qu.remove();
            if (temp.data != -1) {
                System.out.print(temp.data + " ");
                for (Node child : temp.children) {
                    qu.add(child);
                }
            } else {
                if (qu.size() > 0) {
                    qu.add(new Node(-1));
                    System.out.println();
                }
            }
        }

    }

    // level order one level will be printed in each iteration of outer for loop
    static void levelOrderFor(Node root) {
        Deque<Node> qu = new ArrayDeque<>();
        qu.add(root);
        while (!qu.isEmpty()) {
            int size = qu.size();
            for (int i = 1; i <= size; ++i) {
                Node temp = qu.remove();
                System.out.print(temp.data + " ");
                for (Node child : temp.children) {
                    qu.add(child);
                }
            }
            System.out.println();
        }
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
        System.out.println("ZigZag level order!");
        zigZagOrder(root);
        System.out.println("level order using single queue!");
        levelOrder(root);
        System.out.println("level order usign for loop!");
        levelOrderFor(root);
    }
}
