package binarysearchtree;

import java.util.Scanner;

public class BstMain {
	public static void main(String[] args) {
		BinarySearchTree binary = new BinarySearchTree();

		binary.insert(56);
		binary.insert(30);
		binary.insert(70);
		binary.insert(22);
		binary.insert(40);
		binary.insert(11);
		binary.insert(3);
		binary.insert(16);
		binary.insert(60);
		binary.insert(95);
		binary.insert(65);
		binary.insert(63);
		binary.insert(67);
		System.out.println("");

		binary.inorderTraversal(binary.root);
		System.out.println("enter element want to search");
		Scanner scanner = new Scanner(System.in);
		int item = scanner.nextInt();
		binary.searchNode(binary.root, item);
		if (BinarySearchTree.flag)
			System.out.println("\nElement is present");
		else
			System.out.println("\nElement is not present");
	}
}
