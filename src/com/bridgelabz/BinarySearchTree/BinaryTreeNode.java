package com.bridgelabz.BinarySearchTree;

public class BinaryTreeNode<K extends Comparable<K>> {

	K key;
	BinaryTreeNode<K> left;
	BinaryTreeNode<K> right;

	public BinaryTreeNode(K key){
		this.key = key;
		this.left = null;
		this.right = null;
	}

	@Override
	public String toString() {
		return "BinaryTreeNode [key=" + key + ", left=" + left + ", right=" + right + "]";
	}

}
