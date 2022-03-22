package datastructures;

public class DataStructuresMain {
	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		linkedList.append(new Node(56));
		linkedList.append(new Node(30));
		linkedList.append(new Node(70));
		linkedList.printList();
	}
}