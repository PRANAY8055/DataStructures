public class Stack{
	
	int[] stack;
	int ptr;
	
	public Stack(int size) {
		
		stack = new int[size];
		ptr = 0;
		
	}
	
	public void push(int num) {
		
		stack[ptr] = num;
		ptr++;

	}
	
	public int pop() {
		
		int temp = stack[ptr - 1];
		
		stack[ptr - 1] = 0;
		
		ptr--;
		
		return temp;
	}
	
	public int size() {
			
			return ptr;
		}
	
	public static void main(String[] args) {
		
		Stack stack = new Stack(5);
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		System.out.println("Size of stack is " + stack.size());
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		System.out.println("Size of stack is " + stack.size());
		
	}
}