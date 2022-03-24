package datastructures;

public class Node<T extends Comparable<T>> implements Comparable<Node<T>> {
	private T data;
	private Node<T> next;

	public Node(T data) {
		this.data = data;
		this.next = null;
	}

	public T getData() {
		return this.data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}

	public Node getNext() {
		return this.next;
	}

	@Override
	public int compareTo(Node<T> node) {
		return getData().compareTo(node.getData());
	}
}