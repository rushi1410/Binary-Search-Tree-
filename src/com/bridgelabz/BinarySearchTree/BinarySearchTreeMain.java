package com.bridgelabz.BinarySearchTree;

public class BinarySearchTreeMain {
	public static void main(String[] args) {
		BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();
		System.out.println("Welcome to Binary Search Tree Program");

		binarySearchTree.add(56);
		binarySearchTree.add(30);
		binarySearchTree.add(70);
		binarySearchTree.printBinarySearchTree();   

	}
}