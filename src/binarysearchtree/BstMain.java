package binarysearchtree;

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

		binary.inorderTraversal(binary.root);
		int value = binary.size(binary.root);
		if (value == 13)
			System.out.println("\nAll the elements are added.");
		else
			System.out.println("\nBinary tree incomplete.");

	}
}
