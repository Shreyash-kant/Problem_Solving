package Java.Tree.Genric;

import java.util.ArrayList;

public class Node {
    int data;
    ArrayList<Node> children = new ArrayList<>();

    Node() {

    }

    Node(int val) {
        this.data = val;
    }
}
