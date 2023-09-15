
public class Heap{
	
	int[] heap;
	int heapSize;
	
	public Heap(int size) {
		this.heap = new int[size];
		heapSize = 0;
	}
	
	public void insert(int num) {
		
		if(isFull()) {
			System.out.println("Heap is full");
		}
		
		heap[heapSize] = num;
		
		heapifyUp(heapSize);
		
		heapSize++;

	}
	
	public void heapifyUp(int index) {
		
		if(index > 0) {
			
			int parent = getParent(index);
			
			while( heap[parent] > heap[index] ) {
				
				int temp = heap[parent];
				heap[parent] = heap[index];
				heap[index] = temp;
				
				if(containsParent(parent)) {
					index = parent;
					parent = getParent(index);
				}
				else {
					break;
				}
				
			}
		}
		
	}
	
	private boolean containsParent(int child) {
		
		return ( (child - 1) / 2  >= 0 )
	}
	private int getParent(int child) {
		
		return (child - 1) / 2;
	}
	
	private int getLeftChild(int parent) {
		
		return (2 * parent + 1);
	}
	
	private int getRightChild(int parent) {
		
		return (2 * parent + 2);
	}
	
	public void heapifyDown() {
			
		
	}
	
	public boolean isFull() {
		
		return heapSize == heap.length
	}
	
	public boolean isEmpty(){
		
        return heapSize == 0;
    }
	
	public static void main(String[] args) {
		
		Heap heap = new Heap(10);
		
		heap.insert(10);
		heap.insert(5);
		heap.insert(2);
		
	}
}