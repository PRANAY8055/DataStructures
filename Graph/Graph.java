import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.LinkedList;

public class Graph {
	
	private List<List<Integer>> adjList;
	private int V; //Vertices
	private int E; // number of edges
	
	
	public Graph(int vertices) {
		V = vertices;
		adjList = new ArrayList<List<Integer>>(V);
		
		for (int i = 0; i < V; i++) {
			adjList.add(new ArrayList<Integer>());
		}
  
	}
	
	public void addBidirectionalEdge(int u, int v) {
		
		adjList.get(u).add(v);
		adjList.get(v).add(u);
	}
	
	public void addSingledirectionalEdge(int u, int v) {
		adjList.get(u).add(v);
	}
	
	public static void main(String[] args) {
		
		Graph graph = new Graph(6);
		
//		graph.addBidirectionalEdge(0,1);
//		graph.addBidirectionalEdge(0,2);
//		graph.addBidirectionalEdge(0,3);
//		graph.addBidirectionalEdge(1,2);
		
		
		graph.addSingledirectionalEdge(0, 1);
		graph.addSingledirectionalEdge(2, 0);
		graph.addSingledirectionalEdge(2, 4);
		graph.addSingledirectionalEdge(1, 4);
		graph.addSingledirectionalEdge(1, 3);
		graph.addSingledirectionalEdge(5, 3);
		graph.addSingledirectionalEdge(5, 4);
		graph.addSingledirectionalEdge(4, 3);
		graph.addSingledirectionalEdge(1, 2);
		graph.addSingledirectionalEdge(3, 2);
		
		graph.printGraph();
		
		graph.dfs();
		
		System.out.println();
		
		graph.bfs();
		
		System.out.println();
		System.out.println();
		
		System.out.println("The path between the nodes is " + graph.checkPath(0,5));
		
		System.out.println();
		
		System.out.println("The path between the nodes is " + graph.checkPath(0,4));
		
		System.out.println();
		
		System.out.println("The path between the nodes is " + graph.checkPath(5,0));
		
		System.out.println();
		
		System.out.println("The path between the nodes is " + graph.checkPath(5,1));
		
		System.out.println();
		
		System.out.println("The path between the nodes is " + graph.checkPath(5,6));
		
	}
	
	public boolean checkPath(int from, int to) {
		
		boolean[] visited = new boolean[V];
		
		
		Queue<Integer> queue = new LinkedList<>();
		
		queue.offer(from);
		visited[from] = true;
		
		while(!queue.isEmpty()) {
			
			int w = queue.poll();
			
			for(int v: adjList.get(w)) {
				
				if(!visited[v]) {
					queue.offer(v);
					visited[v] = true;
					
					if(v == to) {
						return true;
					}
				}
				
			}
		}
		
		
		return false;
	}
	
	public void bfs() {
		
		boolean[] visited = new boolean[V];
		
		System.out.println();
		System.out.println("BFS are: ");
		
		for (int i = 0; i < V; i++) {
			if(!visited[i]) {
				bfs(i, visited);
			}
		}
		
		
	}
	
	public void bfs(int i, boolean[] visited) {
		
		Queue<Integer> queue = new LinkedList<>();
		
		queue.offer(i);
		visited[i] = true;
		
		while(!queue.isEmpty()) {
			
			int w = queue.poll();
			
			System.out.print(w + " ");
			
			for(int v: adjList.get(w)) {
				
				if(!visited[v]) {
					queue.offer(v);
					visited[v] = true;
				}
				
			}
		}
	}
	
	public void dfs() {
		
		boolean[] visited = new boolean[V];
		
		System.out.println();
		System.out.println("DFS are: ");
		
		for (int i = 0; i < V; i++) {
			if(!visited[i]) {
				dfs(i, visited);
			}
		}
		
	}
	
	public void dfs(int i, boolean[] visited) {
		
		visited[i] = true;
		
		System.out.print(i + " ");
		
		for(int v: adjList.get(i)) {
			if(!visited[v]) {
				dfs(v,visited);
			}
		}
		
	}
	
	public void printGraph() {
		
	    for (int i = 0; i < adjList.size(); i++) {
	      System.out.println("\nVertex " + i + ":");
	      for (int j = 0; j < adjList.get(i).size(); j++) {
	        System.out.print(" -> " + adjList.get(i).get(j));
	      }
	      System.out.println();
	    }
	    
	    
	  }
	
}