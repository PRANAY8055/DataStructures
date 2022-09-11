
// Created by Pranay Reddy

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
				System.out.print(n.data + " ");
				n = n.next;
			}
			
			System.out.print(n.data + " ");
			System.out.println();
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
	
	/*
	
	public static void findMiddleElementEven(LinkedList list) {
		
		Node singlePointer,doublePointer,n;
		
		singlePointer = null;
		doublePointer = null;
		n = list.head;
		
		while(n.next != null) {
			
		}
		
	}	
	
	*/
	
	
	public static void findNthNodeFromEnd(LinkedList list, int index) {
		
		reverseLinkedList(list);
		
		Node n = list.head;
		
		for(int i=0;i<index;i++) {
			n = n.next;
		}
		
		//show(list);
		
		System.out.println("Element at " + index + " from last side is " + n.data);
		
	}
	
	
	public static void findNthNodeFromEndOptimal(LinkedList list, int index) {
		
	  Node firstPtr = list.head;
	  Node mainPtr = list.head;
	  
	  int count = 1;
	  
	  while(count < index) {
		  firstPtr = firstPtr.next;
		  count++;
	  }
	  
	  while(firstPtr.next != null) {
		  firstPtr = firstPtr.next;
		  mainPtr = mainPtr.next;
	  }
		
	  System.out.println("Element at " + index + " from last side is " + mainPtr.data);
		
	}
	
	public void removeDuplicate() {
		Node n = head;
		
		while(n != null && n.next != null) {
			if(n.data == n.next.data) {
					n.next = n.next.next;			
			}
			else {
				n = n.next;
			}			
		}
		
	}
	
	
	public void insertNode(int value) {
		Node n = head;
		
		Node val = new Node(value);
		
		if(n == null) {
			System.out.println("Linked list is empty");
		}
		
		if(val.data <= n.data) {
			val.next = n;
			head = val;
			return;
		}
		
		while(n.next != null) {
			if(n.data <= val.data && val.data <= n.next.data) {
					val.next = n.next;
					n.next = val;
					return;
			}
			else {
				n = n.next;
			}			
		}
		n.next = val;
		
		
	}	
	
	
	public void removeKey(int value) {
		Node n = head;
		
		if(n.data == value) {
			head = n.next;
			return;
		}
		
		while(n.next != null) {
			if(n.next.data == value) {
				n.next = n.next.next;
				return;
			}
			else {
				n = n.next;	
			}				
		}		
		
	}
	
	
	
	public void checkLoopInList() {
		
		Node slowPtr = head;
		Node fastPtr = head;
		
		while(fastPtr != null && fastPtr.next!= null) {
			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next.next;
			
			if(slowPtr == fastPtr) {
				System.out.println("Loop in the linked list is "+true);
				return;
			}
			
		}
		
		System.out.println("Loop in the linked list is "+false);
		
	}	
	
	
	public void createLoopList() {
		
		Node first = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		Node fourth = new Node(4);
		Node fifth = new Node(5);
		
		head = first;
		first.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = third;
		
	}
	
	
	public void nannakuprematho() {
		
		Node node = head;
		
		
		while(node != null && node.next != null) {
			
			node.next = node.next.next;
			
		}
		
	}
	
	
	public static LinkedList mergeTwoSortedLists(LinkedList listNew1,LinkedList listNew2) {
		
		Node n1 = listNew1.head;
		Node n2 = listNew2.head;
		Node n = null;
		
		LinkedList list = new LinkedList();
		
		while(n1 != null && n2 != null) {
			if(n1.data <= n2.data) {
				if(list.head == null) {
					n = new Node(n1.data);
					list.head = n;
				}
				else {
					n.next = new Node(n1.data);
					n = n.next;
				}
				n1 = n1.next;
			}
			else {
				if(list.head == null) {
					n = new Node(n2.data);
					list.head = n;
				}
				else {
					n.next = new Node(n2.data);
					n = n.next;
				}
				n2 = n2.next;						
			}
		}
		
		if(n1 == null) {
			while(n2 != null) {
				n.next = new Node(n2.data);
				n2 = n2.next;
				n = n.next;
			}			
		}
		else if(n2 == null){
			while(n1 != null) {
				n.next = new Node(n1.data);
				n1 = n1.next;
				n = n.next;
			}			
		}
		
		return list;
		
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
		
		/*
		
		findMiddleElementEven(list); // Best approach		
		
		System.out.println("*************************************");
		
		*/
		
		show(list);
		
		findNthNodeFromEnd(list,5);
		
		System.out.println("*************************************");
		
		show(list);
		
		findNthNodeFromEndOptimal(list,5);
		
		System.out.println("*************************************");
		
		LinkedList listNew = new LinkedList();
		
		listNew = insert(listNew, 10);
		listNew = insert(listNew, 10);
		listNew = insert(listNew, 10);
		listNew = insert(listNew, 20);
		listNew = insert(listNew, 30);
		listNew = insert(listNew, 30);
		listNew = insert(listNew, 40);
		
		show(listNew);
		
		System.out.println("*************************************");
		
		listNew.removeDuplicate();  // Remove duplicate from sorted singly linked list
		
		show(listNew);
		
		System.out.println("*************************************");
		
		listNew.insertNode(35); // Insert node in sorted linked list in java
		listNew.insertNode(50);
		listNew.insertNode(0);
		listNew.insertNode(15);
		
		show(listNew);
		
		System.out.println("*************************************");
		
		
		listNew.removeKey(15);  // Remove the key in the linked list
		listNew.removeKey(35);
		listNew.removeKey(0);
		 
		show(listNew);		
		
		System.out.println("*************************************");
		
		listNew.checkLoopInList(); // Check whether linked list is rotating or not
		
		System.out.println("*************************************");
		
		LinkedList loopList = new LinkedList();
		
		loopList.createLoopList();
		
		loopList.checkLoopInList();
		
		System.out.println("*************************************");
		
		// loopList.knowFirstNodeInLoop();
		
		System.out.println("*************************************");
		
		
		LinkedList listNew1 = new LinkedList();
		LinkedList listNew2 = new LinkedList();
		LinkedList listNew3 = new LinkedList();
		
		listNew1 = insert(listNew1, -10);
		listNew1 = insert(listNew1, -5);
		listNew1 = insert(listNew1, 10);
		listNew1 = insert(listNew1, 30);
		listNew1 = insert(listNew1, 50);
		listNew1 = insert(listNew1, 60);
		listNew1 = insert(listNew1, 75);
		
		
		listNew2 = insert(listNew2, 0);
		listNew2 = insert(listNew2, 20);
		listNew2 = insert(listNew2, 25);
		listNew2 = insert(listNew2, 40);
		listNew2 = insert(listNew2, 70);
		listNew2 = insert(listNew2, 80);
		listNew2 = insert(listNew2, 90);
		listNew2 = insert(listNew2, 95);
		listNew2 = insert(listNew2, 100);
		
		listNew3 = mergeTwoSortedLists(listNew1,listNew2);
		
		System.out.println("*************************************");
		
		show(listNew3);	
		
		/* 

		LinkedList nnp = new LinkedList();
		
		for(int i=1;i<=100;i++) {
			nnp = insert(nnp, i);
		}
		
		show(nnp);
		
		nnp.nannakuprematho();
		
		System.out.println("*************************************");
		
		*/
		
		System.out.println("*************************************");
		
		
		
	
	}
	
}
