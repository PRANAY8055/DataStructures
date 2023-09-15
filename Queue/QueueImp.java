
public class QueueImp {
	
	int[] stack1, stack2;
	int ptr1, ptr2;
	
	public QueueImp(int size) {
		
		stack1 = new int[size];
		stack2 = new int[size];
		
		ptr1 = 0;
		ptr2 = 0;
		
	}
	
	public int poll() {
				
		int temp = stack2[ptr2 - 1];
		
		System.out.println(ptr2);
		
		for(int i = 0; i < ptr2; i++) {
			stack1[i] = stack1[i + 1];
		}
		
		ptr2--;
		ptr1--;
		
		
		stack2[ptr2] = 0;
		
		
		return temp;
	}
	
	
	public void offer(int num) {
		
		stack1[ptr1] = num;
		ptr1++;
		
		ptr2 = 0;
		for(int i = 0; i < ptr1; i++) {
			stack2[i] = stack1[ptr1 - i - 1];
			ptr2++;
		}
		
		
	}
	
	public int size() {
		
		return ptr2;
	}
	
	public void printArray() {
		
		for(int i = 0; i < stack2.length; i++) {
			System.out.print(stack2[i] + " ");
		}
		
	}
	
	public void printStack1Array() {
			
			for(int i = 0; i < stack1.length; i++) {
				System.out.print(stack1[i]  + " ");
			}
			
		}

	public static void main(String[] args) {
		
		QueueImp queue = new QueueImp(5);
		
		queue.offer(1);
		queue.offer(2);
		queue.offer(3);
		queue.offer(4);
		
//		System.out.println("Size of queue is " + queue.size());
			
//		queue.printArray();
		
//		
//		System.out.println();
//		
//		queue.printStack1Array();
		
		System.out.println("Size of queue is " + queue.size());
		System.out.println(queue.poll());
		
		queue.printStack1Array();
		
		System.out.println();
		
		queue.printArray();
		
//		System.out.println(queue.poll());
//		System.out.println("Size of queue is " + queue.size());
//		
//		queue.printStack1Array();
//		
//		System.out.println();
//		
//		queue.printArray();

//		queue.offer(5);
//		System.out.println("Size of queue is " + queue.size());
//		System.out.println(queue.poll());
//		System.out.println(queue.poll());
//		System.out.println(queue.poll());
		
//		System.out.println("Size of queue is " + queue.size());
		
	}

}
