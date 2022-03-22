package datastructures;

public class LinkedList {
	Node head;
	Node tail;

	public LinkedList() {
		this.head = null;
		this.tail = null;
	}

	public void add(Node node) {
		if (head == null) {
			head = node;
			tail = node;
		} else {
			node.setNext(head);
			head = node;
		}
	}

	public void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.getData() + " ");
			temp = temp.getNext();
		}
	}

}