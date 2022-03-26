package binarysearchtree;

public class BinarySearchTree {
	Node root;
	static boolean flag = false;

	public BinarySearchTree() {
		root = null;
	}

	public void insert(int data) {
		Node newNode = new Node(data);

		if (root == null) {
			root = newNode;
			return;
		} else {
			Node current = root;
			Node parent = null;
			while (true) {
				parent = current;
				if (data < current.data) {
					current = current.left;
					if (current == null) {
						parent.left = newNode;
						return;
					}
				} else {
					current = current.right;
					if (current == null) {
						parent.right = newNode;
						return;
					}
				}
			}
		}
	}

	public void inorderTraversal(Node node) {
		if (root == null)
			System.out.println("Empty tree");
		else {
			if (node.left != null)
				inorderTraversal(node.left);
			System.out.print(node.data + " ");
			if (node.right != null)
				inorderTraversal(node.right);
		}
	}

	public void searchNode(Node node, int value) {
		if (root == null)
			System.out.println("Tree is empty");
		else {
			if (node.data == value) {
				flag = true;
				return;
			}
			if (flag == false && node.left != null) {
				searchNode(node.left, value);
			}
			if (flag == false && node.right != null) {
				searchNode(node.right, value);
			}
		}
	}

	public int size(Node node) {
		if (node == null)
			return 0;
		else
			return (size(node.left) + 1 + size(node.right));
	}
}
