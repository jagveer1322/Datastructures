package datastructures;

public class DataStructuresMain {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack();
		stack.push(70);
		stack.push(30);
		stack.push(56);
		stack.printStack();
		stack.pop();
		stack.pop();

		stack.printStack();
	}
}