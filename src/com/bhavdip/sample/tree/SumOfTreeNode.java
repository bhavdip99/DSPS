package com.bhavdip.sample.tree;

public class SumOfTreeNode {
    public static void main(String[] args) {

        Node root = new Node(9);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);

        root.left = node2;
        root.right = node3;
        node2.left = node4;
        node2.right = node5;
        node3.left = node6;

        SumOfTreeNode tree = new SumOfTreeNode();
        System.out.println(tree.sumOfNodes(root));
    }

    int sumOfNodes(Node node) {
        if (node == null) return 0;
        return node.data + sumOfNodes(node.left) + sumOfNodes(node.right);
    }
}

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
    }
}
