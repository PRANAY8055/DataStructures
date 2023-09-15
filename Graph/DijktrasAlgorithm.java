import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Arrays;

public class DijktrasAlgorithm {
	
	int vertices;
	
	List<List<int[]>> list;
	
	public DijktrasAlgorithm(int V) {
		this.vertices = V;
		list = new ArrayList<List<int[]>>(V);
		
		for(int i = 0; i < vertices; i++) {
			list.add(new ArrayList<int[]>());
		}
	}
	
	public void addEdge(int u, int v, int w) {
		list.get(u).add(new int[] {v,w});
		list.get(v).add(new int[] {u,w});
	}
	
	public int[] dijkstra(int source) {
		
		int numNodes = list.size();
        int[] distances = new int[numNodes];
        boolean[] visited = new boolean[numNodes];
        
        Arrays.fill(distances, Integer.MAX_VALUE);
        distances[source] = 0;
        
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a,b) -> a[1] - b[1]);
        minHeap.offer(new int[] {source, 0});
        
        while(!minHeap.isEmpty()) {
        	
        	int[] path = minHeap.poll();
        	int node = path[0];
        	
        	visited[node] = true;
        	
        	List<int[]> neighbors = list.get(node);
        	
        	for(int[] neighbor_node: neighbors) {
        		if(!visited[neighbor_node[0]]) {
        			int current_distance = distances[node] + neighbor_node[1];
        			if(current_distance < distances[neighbor_node[0]]) {
        				distances[neighbor_node[0]] = current_distance;
        				minHeap.offer(new int[] {neighbor_node[0], current_distance});
        			}
        		}
        	}
        	
        }
        
        return distances;
        
	}

	public static void main(String[] args) {
		
		int V = 9;
		
		DijktrasAlgorithm graph = new DijktrasAlgorithm(V);
		
		graph.addEdge(0, 1, 4);
		graph.addEdge(0, 7, 8);
		graph.addEdge(1, 2, 8);
		graph.addEdge(1, 7, 11);
		graph.addEdge(2, 3, 7);
		graph.addEdge(2, 8, 2);
		graph.addEdge(2, 5, 4);
		graph.addEdge(3, 4, 9);
		graph.addEdge(3, 5, 14);
		graph.addEdge(4, 5, 10);
		graph.addEdge(5, 6, 2);
		graph.addEdge(5, 7, 13);
		graph.addEdge(6, 7, 1);
		graph.addEdge(4, 8, 6);
		graph.addEdge(1, 5, 1);
 
		int[] shortestDistances = graph.dijkstra(0);

        for (int i = 0; i < shortestDistances.length; i++) {
            System.out.println("Shortest distance from node 0 to node " + i + ": " + shortestDistances[i]);
        }
        
	}

}
