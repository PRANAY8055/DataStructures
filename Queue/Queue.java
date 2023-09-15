public class Queue{
	
	int[] queue;
	int front, rear;
	
	public Queue(int size) {
		
		queue = new int[size];
		front = 0;
		rear = 0; 
		
	}
	
	public void offer(int num) {
		
		queue[rear] = num;
		rear++;

	}
	
	public int poll() {
		
		int temp = queue[front];
		
		for(int i = 1; i < rear; i++) {
			queue[i - 1] = queue[i];
		}
		rear--;
		
		return temp;
	}
	
	public int size() {
			
			return rear;
	}
	
	public static void main(String[] args) {
		
		Queue queue = new Queue(5);
		
		queue.offer(1);
		queue.offer(2);
		queue.offer(3);
		queue.offer(4);
		queue.offer(5);
		
		System.out.println("Size of queue is " + queue.size());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println("Size of queue is " + queue.size());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		
		System.out.println("Size of queue is " + queue.size());
		
	}
}