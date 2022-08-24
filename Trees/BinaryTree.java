import java.util.Stack;

class Node{
		
		int data;
		Node left,right;
		
		Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

public class BinaryTree {
	
	Node root;
	
	/*  This code also works
	
	static class Node{
		
		int data;
		Node left,right;
		
		Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
	
	*/
	
	public static void preOrder(Node root) {
		
		if(root == null) {
			return;
		}
		
		System.out.print(root.data + " ");		
		preOrder(root.left);   
		preOrder(root.right);
	}
	
	public static void inOrder(Node root) {
		
		if(root == null) {
			return;
		}
		
		inOrder(root.left); 
		
		System.out.print(root.data + " ");		
		
		inOrder(root.right);
	}
	
	public static void postOrder(Node root) {
		
		if(root == null) {
			return;
		}
			
		postOrder(root.left); 
		
		postOrder(root.right);
		
		System.out.print(root.data + " ");	
	}

	
	public static void preOrderIterative(Node root) {
		
		if(root == null) {
			return;
		}
		
		Stack<Node> stack= new Stack<>();
		
		stack.push(root);
		
		while(!stack.isEmpty()) {
			
			Node temp = stack.pop();
			
			System.out.print(temp.data + " ");
			
			if(temp.right != null) {
				stack.push(temp.right);
			}
			
			if(temp.left != null) {
				stack.push(temp.left);
			}
			
		}
		
	}
	
	public static void inOrderIterative(Node root) {
		
		if(root == null) {
			return;
		}
		
		Stack<Node> stack= new Stack<>();
		
		Node temp = root;
		
		while(!stack.isEmpty() || temp != null) {
			
			
			if(temp != null) {
				stack.push(temp);
				temp = temp.left;				
			}
			else {
				temp = stack.pop();
				System.out.println(temp.data + " ");				
				temp = temp.right;				
				
			}
		}
		
	}
	
	public static void postOrderIterative(Node root) {
		
		if(root == null) {
			return;
		}
		
		Stack<Node> stack= new Stack<>();
		
		Node temp = root;
		
		while(!stack.isEmpty() || temp != null) {
			
			
			if(temp.left != null) {
				stack.push(temp);
				temp = temp.left;				
			}
			else if(temp.right != null) {
				stack.push(temp);
				temp = temp.right;
			}
			else {				
				System.out.print(temp.data + " ");	
				temp = stack.pop();
				System.out.print(temp.data + " ");	
				temp = stack.pop();
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinaryTree tree = new BinaryTree();
		
		tree.root = new Node(8);		
		tree.root.left = new Node(6);
		tree.root.right = new Node(12);
		tree.root.left.left = new Node(2);
		tree.root.left.right = new Node(4);
		tree.root.right.left = new Node(10);
		tree.root.right.right = new Node(14);
		
		/*
		 *                  8
		 *                /   \
		 *               6     12
		 *              / \    / \
		 *             2   4  10  14
		 *            
		 * 
		 * 
		 */
		
		// Recursive Method
		
		System.out.println("Pre Order");
		
		preOrder(tree.root);   // root,left,right
		
		System.out.println();		
		System.out.println("**********************************************");
		
		System.out.println("In Order");
		
		inOrder(tree.root);   // left,root,right
		
		System.out.println();
		System.out.println("**********************************************");
		
		System.out.println("Post Order");
		
		postOrder(tree.root);   // left,right,root
		
		System.out.println();
		System.out.println("**********************************************");
		
		
		// Iterative Method
		
		System.out.println("Pre Order Iterative");
		
		preOrderIterative(tree.root); // root,left,right
		
		System.out.println();
		System.out.println("**********************************************");
		
		/*
		
		inOrderIterative(tree.root); // left,root,right
		
		System.out.println("**********************************************");
		
		postOrderIterative(tree.root); // left,right,root
		
		System.out.println("**********************************************");
		
		*/
		

	}

}
