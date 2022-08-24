public class LinkedList {
	
	Node head; // head of the list
	
	static class Node{
		
		int data;
		Node next;
		
		Node(int data){
			this.data = data;	
			this.next = null;
		}
		
	}
	
	public static LinkedList insert(LinkedList list, int data) {
		
		Node node = new Node(data);
		
		
		if(list.head == null) {
			list.head = node;
		}
		
		else {
			
			Node n = list.head;		
			
			while(n.next != null) {
				n = n.next;
			}
			
			n.next = node;
			
		}
		
		return list;
		
	}
	
	public static void show(LinkedList list) {
		
		Node n = list.head;
		
		if(list.head==null) {
			System.out.println("null");
		}
		
		else {
			while(n.next != null){
				System.out.println(n.data);
				n = n.next;
			}
			
			System.out.println(n.data);
		}
		
	}
	

	public static void insertAtFirst(LinkedList list, int data) {
		// TODO Auto-generated method stub
		
		Node node = new Node(data);
		
		node.next = list.head;
		list.head = node;      // Why this line is compulsory
		
	}
	
	public static LinkedList insertAt(LinkedList list, int index, int data) {
		
		if (index == 0) {
			insertAtFirst(list, data);
		}
		else {	
			Node node = new Node(data);
			
			Node n = list.head;
			
		    for(int i=0;i<index-1;i++) {
			   n = n.next;
			} 
	
			node.next = n.next;
			n.next = node;

			}	
		
		return list;
		
	}

	public static void deleteFirst(LinkedList list) {
		
		list.head = list.head.next;
		
  /*	Node n = list.head;
		
		list.head = n.next; */
		
	}
	
	public static void deleteAt(LinkedList list, int index) {
		
		if (index == 0) {
			deleteFirst(list);
		}
		else {
			
			Node n = list.head;
			
			 for(int i=0;i<index-1;i++) {
				   n = n.next;
			} 
			 
			 n.next = n.next.next;
		}		
		
	}
	
	
	public static void deleteLast(LinkedList list) {
		
	Node n = list.head;
		
	 while(n.next.next != null) {
		 n = n.next;
	 }
	 n.next = null;
	}
	
	
	public static void deleteAll(LinkedList list) {
		
		list.head = null;
	
	}

	public static void reverseLinkedList(LinkedList list) {
		
		Node previous = null;
		Node current = list.head;
		Node next = null;
		
		while(current.next != null) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		
		current.next = previous;
		list.head = current;
	}

	public static void getElementAt(LinkedList list, int index) {
		
		Node n = list.head;
		int i=0;
		for(;i<index;i++) {
			n = n.next;
		}
		
		System.out.println("Element at " + i + " index is " + n.data);
		
	}
	
	public static void findMidElement(LinkedList list) {
		
		int size = 0;
		
		Node n = list.head;
		
		while(n != null) {
			size ++;
			n = n.next;
		}
	
		size = size / 2;
		
		getElementAt(list, size);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList list = new LinkedList();
		
		list = insert(list, 10);
		list = insert(list, 20);
		list = insert(list, 40);
		
		
	 	show(list);
	 	
	 	System.out.println("*************************************");
		
		insertAtFirst(list,0);   // written type is optional
		
		show(list);
		
		System.out.println("*************************************");
		
		list = insertAt(list,3,30);
		
		show(list);
		
		System.out.println("*************************************");
		
		deleteFirst(list);
		
		show(list);
		
		System.out.println("*************************************");
		
		deleteAt(list,3);
		
		show(list); 
		
		System.out.println("*************************************");		
		
		deleteLast(list);
		
		show(list); 
		
		System.out.println("*************************************");
		
		deleteAll(list);
		
		show(list);
		
		System.out.println("*************************************");
		
		list = insert(list, 10);
		list = insert(list, 20);
		list = insert(list, 30);
		list = insert(list, 40);
		list = insert(list, 50);
		list = insert(list, 60);
		list = insert(list, 70);

		reverseLinkedList(list);
		
		show(list);
		
		System.out.println("*************************************");
		
		findMidElement(list);  // Naive Approach
		
		System.out.println("*************************************");
		
		// findMiddleElementEven(list); // Best approach
		
		
		
		
		
	}
	
}
