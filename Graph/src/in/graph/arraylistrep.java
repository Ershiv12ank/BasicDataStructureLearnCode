package in.graph;

import java.util.ArrayList;
import java.util.Scanner;

public class arraylistrep {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
		
		System.out.println("Enter number of vertex: ");
		int V = scan.nextInt();
		
		System.out.println("Enter number of Edges: ");
		int E = scan.nextInt();
		
		for(int i = 0; i < V; i++) {
			adj.add(new ArrayList<>());
		}
		
		for(int i = 0; i < E; i++) {
			int u = scan.nextInt();
            int v = scan.nextInt();

           
            adj.get(u).add(v);
            adj.get(v).add(u);  
		}
		
		 System.out.println("Adjacency List:");
	        for (int i = 0; i < V; i++) {
	            System.out.print(i + " -> ");
	            for (int node : adj.get(i)) {
	                System.out.print(node + " ");
	            }
	            System.out.println();
	        }
		

	}

}
