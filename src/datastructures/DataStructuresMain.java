package datastructures;

public class DataStructuresMain {
	public static void main(String[] args) {
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		linkedList.append(new Node(56));
		linkedList.append(new Node(30));
		linkedList.append(new Node(70));

		Node result = linkedList.search(30);
		if (result != null) {
			System.out.println("Key Found");
		}
	}
}