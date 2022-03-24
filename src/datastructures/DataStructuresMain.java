package datastructures;

public class DataStructuresMain {
	public static void main(String[] args) {
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		linkedList.append(new Node(56));
		linkedList.append(new Node(30));
		linkedList.append(new Node(40));
		linkedList.append(new Node(70));
		System.out.println("Size of list before deletion--->");
		System.out.println(linkedList.size());
		linkedList.deleteNode(40);
		System.out.println("Size of list after deletion---> ");
		System.out.println(linkedList.size());
	}
}