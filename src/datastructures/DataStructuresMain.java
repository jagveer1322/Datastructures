package datastructures;

public class DataStructuresMain {
	public static void main(String[] args) {
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		linkedList.append(new Node(56));
		linkedList.append(new Node(30));
		linkedList.append(new Node(70));
		System.out.println(" Before Insertion --->");
		linkedList.printList();
		System.out.println("=============================================\n  After Insertion---->");
		linkedList.add(new Node(40), 30);
		linkedList.printList();

	}
}