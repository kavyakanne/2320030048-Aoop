package stack;

public class StackTest {
	public static void main(String[] args) {
		Stack<Integer> linkedListStack = new LinkedList<>();
        linkedListStack.push(10);
        linkedListStack.push(20);
        linkedListStack.push(30);
        System.out.println("LinkedListStack (Integer):");
        System.out.println("Peek: " + linkedListStack.peek());
        System.out.println("Pop: " + linkedListStack.pop());
        System.out.println("Peek after pop: " + linkedListStack.peek());
        
        Stack<String> arrayStack = new Array<>();
        arrayStack.push("Apple");
        arrayStack.push("Banana");
        arrayStack.push("Cherry");
        System.out.println("\nArrayStack (String):");
        System.out.println("Peek: " + arrayStack.peek()); 
        System.out.println("Pop: " + arrayStack.pop());  
        System.out.println("Peek after pop: " + arrayStack.peek()); 
        
        Stack<Double> doubleArrayStack = new Array<>();
        doubleArrayStack.push(10.5);
        doubleArrayStack.push(20.75);
        doubleArrayStack.push(30.25);
        System.out.println("\nArrayStack (Double):");
        System.out.println("Peek: " + doubleArrayStack.peek()); 
        System.out.println("Pop: " + doubleArrayStack.pop());  
        System.out.println("Peek after pop: " + doubleArrayStack.peek());
	}

}
