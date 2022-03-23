package datastructures;

public class DataStructuresMain {
	public static void main(String[] args) {
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		linkedList.append(new Node(56));
		linkedList.append(new Node(30));
		linkedList.append(new Node(70));
		System.out.println("Before Deletion");
		linkedList.printList();
		System.out.println("=============================================\nAfter Deletion---->");
		linkedList.pop();
		linkedList.printList();
	}
}