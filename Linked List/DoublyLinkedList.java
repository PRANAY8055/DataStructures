
// Created by Pranay Reddy

public class DoublyLinkedList {
	
	ListNode head;
	ListNode tail;
	int length;
	
	public class ListNode {		
		int data;
		ListNode next;
		ListNode previous;
		
		public ListNode(int data) {
			this.data = data;
		}
		
	}
	
	public DoublyLinkedList() {
		this.head = null;
		this.tail = null;
		this.length = 0;
	}
	
	public void insert(int data) {
		
		ListNode n = head;
		
		ListNode node = new ListNode(data);
		
		if(isEmpty()) {
			head = node;
			length++;
		}
		else {
			
			while(n.next != null) {
				n = n.next;
			}
			
			n.next = node;
			node.previous = n;
			tail = node;
			length++;
			
		}
		
	}
	
	public void showForward() {
		
		ListNode n = head;
		
		if(isEmpty()) {
			System.out.println("None");
		}
		else {
			while(n != null) {
				System.out.print(n.data + " ");
				n = n.next;
			}
			
			System.out.println();
		}
	}
	
	public void showEnd() {
		
		ListNode n = tail;
		
		if(isEmpty()) {
			System.out.println("None");
		}
		else {
			while(n != null) {
				System.out.print(n.data + " ");
				n = n.previous;
			}
			
			System.out.println();
		}
	}

	public boolean isEmpty() {
		if (length==0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public int length() {
		return length;
	}
	
	public void insertAtFirst(int data) {
		
		ListNode node = new ListNode(data);
		
		if(isEmpty()) {
			System.out.println("None");
			head = node;
		}
		else {
			ListNode n = head;			
			
			node.next = n;
			n.previous = node;
			head = node;
			length++;
		}
	}
	
	public void insertAtEnd(int data) {
		
		ListNode n = tail;
		
		ListNode node = new ListNode(data);
		
		if(isEmpty()) {
			System.out.println("None");
			tail = node;
		}
		else {
			n.next = node;
			node.previous = n;
			tail = node;
			length++;
		}
		
		
	}
	
	
	public ListNode deleteFirstNode(){
		ListNode n = head;
		
		if(isEmpty()) {
			System.out.println("Nothing to delete");
		}
		else if(head == tail) {
			tail = null;
		}
		else {
			head.next.previous = null;
		}	
		
		head = head.next;
		n.next = null;
		return n;
	}
	
	public ListNode deleteLastNode(){
		ListNode n = tail;
		
		if(isEmpty()) {
			System.out.println("Nothing to delete");
		}
		else if(head == tail) {
			head = null;
		}
		else {
			tail.previous.next = null;
		}
		
		tail = tail.previous;
		n.previous = null;
		return n;
	}
	
	public static void main(String[] args) {
		
		DoublyLinkedList dl = new DoublyLinkedList();
		
		dl.insert(10);
		dl.insert(20);
		dl.insert(30);
		dl.insert(40);
		dl.insert(50);
		
		System.out.println("Head is " + dl.head.data);
		System.out.println("Tail is " + dl.tail.data);
		
		System.out.println("*************************************");
		
		dl.showForward();
		
		System.out.println("*************************************");
		
		dl.showEnd();
		
		System.out.println("*************************************");
		
		dl.insertAtFirst(0);
		dl.insertAtEnd(60);
		
		dl.showForward();		
		
		System.out.println("Length is " + dl.length());
		
		System.out.println("*************************************");

		DoublyLinkedList dll = new DoublyLinkedList();
		
		dll.insert(100);
		dll.insert(200);
		dll.insert(300);
		dll.insert(400);
		dll.insert(500);
		
		System.out.println("Length is " + dll.length());
		
		System.out.println("*************************************");
		
		System.out.println("Deleted node is "+ dl.deleteFirstNode().data); 
		
		System.out.println("Deleted node is "+ dl.deleteLastNode().data); 
		
		dl.showForward();

		System.out.println("*************************************");
		
		
	}

}
