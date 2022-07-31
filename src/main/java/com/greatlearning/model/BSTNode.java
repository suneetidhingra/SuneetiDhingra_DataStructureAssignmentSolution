package com.greatlearning.model;

public class BSTNode {

    private final int val;
    private BSTNode left;
    private BSTNode right;

    public BSTNode(int val) {
        this.val = val;
    }

    public BSTNode(int val, BSTNode left, BSTNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public int getVal() {
        return val;
    }

    public BSTNode getLeft() {
        return left;
    }

    public void setLeft(BSTNode left) {
        this.left = left;
    }

    public BSTNode getRight() {
        return right;
    }

    public void setRight(BSTNode right) {
        this.right = right;
    }
}
