package datastructures;

public class LinkedList<T> {
	Node<T> head;
	Node<T> tail;

	public LinkedList() {
		this.head = null;
		this.tail = null;
	}

	public void add(Node<T> node) {
		if (head == null) {
			head = node;
			tail = node;
		} else {
			node.setNext(head);
			head = node;
		}
	}

	public void add(Node<T> node, T key) {
		Node<T> temp = head;
		while (temp != null && !temp.getData().equals(key)) {
			temp = temp.getNext();
		}
		if (temp == null) {
			System.err.println("Cannot find " + key);
			return;
		}
		if (tail.equals(temp)) {
			tail = node;
		}
		node.setNext(temp.getNext());
		temp.setNext(node);
	}

	public void append(Node<T> node) {
		if (head == null) {
			head = node;
			tail = node;
		} else {
			tail.setNext(node);
			tail = node;
		}
	}

	public Node<T> search(T key) {
		Node<T> temp = head;
		while (temp != null && !temp.getData().equals(key)) {
			temp = temp.getNext();
		}
		if (temp == null) {
			System.err.println("Cannot find " + key);
		}
		return temp;
	}

	public void printList() {
		Node<T> temp = head;
		while (temp != null) {
			System.out.print(temp.getData().toString() + " ");
			temp = temp.getNext();
		}
		System.out.println();
	}

	public void pop() {
		if (head == null) {
			System.out.println("list is empty");
			return;
		}
		head = head.getNext();
		if (head == null) {
			tail = null;
		}
	}

	public void popLast() {
		if (head == null) {
			System.out.println("list is empty");
		} else if (head == tail) {
			head = tail = null;
		} else {
			Node<T> temp = head;
			while (temp.getNext() != tail) {
				temp = temp.getNext();
			}
			tail = temp;
			temp.setNext(null);
		}
	}

	public void deleteNode(T key) {
		Node<T> keyNode = search(key);
		if (keyNode == null) {
			return;
		}
		if (head == keyNode) {
			head = null;
			tail = null;
		} else {
			Node<T> temp = head;
			while (temp.getNext() != keyNode) {
				temp = temp.getNext();
			}
			temp.setNext(keyNode.getNext());
			if (keyNode == tail) {
				tail = temp;
			}
		}
	}

	public int size() {
		int length = 0;
		Node temp = head;
		while (temp != null) {
			temp = temp.getNext();
			length++;
		}
		return length;
	}
}