package com.greatlearning;

import com.greatlearning.model.BSTNode;

public class Solution2 {

    public static void run() {

        BSTNode a = new BSTNode(10);
        BSTNode b = new BSTNode(30, a, null);
        BSTNode c = new BSTNode(55);
        BSTNode d = new BSTNode(60, c, null);
        BSTNode root = new BSTNode(50, b, d);

        root = convertBSTToSkewedBST(root);

        printSkewedBST(root);
    }

    private static BSTNode convertBSTToSkewedBST(BSTNode root) {

        if (root == null || root.getLeft() == null) {
            return root;
        }
        BSTNode newRoot = convertBSTToSkewedBST(root.getLeft());
        root.setLeft(null);

        BSTNode rightMostNode = getRightMostNode(newRoot);
        rightMostNode.setRight(root);

        root.setRight(convertBSTToSkewedBST(root.getRight()));
        return newRoot;
    }

    private static BSTNode getRightMostNode(BSTNode root) {

        BSTNode curr = root;
        while (curr.getRight() != null) {
            curr = curr.getRight();
        }
        return curr;
    }

    private static void printSkewedBST(BSTNode root) {
        BSTNode curr = root;
        while (curr != null) {
            System.out.print(curr.getVal() + " ");
            curr = curr.getRight();
        }
    }
}
