package in.graph;

import java.util.ArrayList;
import java.util.Scanner;

public class Weightedrep {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	ArrayList<ArrayList<int []>> adj = new ArrayList<>();
	System.out.println("Enter vertex:");
	int vetex = scan.nextInt();
	System.out.println("Enter Edge");
	int edge = scan.nextInt();
	
	for(int i = 0 ; i < vetex; i++) {
		adj.add(new ArrayList<>());
	}
	
	for(int i = 0 ; i < edge; i++) {
		int v = scan.nextInt();
		int e = scan.nextInt();
		int w = scan.nextInt();
		
		adj.get(v).add(new int[]{e,w});
		adj.get(e).add(new int[]{v,w});
	}
	
	for(int i = 0 ; i < adj.size(); i++) {
		System.out.print(i + "->");
		for (int[] edge1 : adj.get(i)) {
            System.out.print("(" + edge1[0] + ", weight=" + edge1[1] + ") ");
        }
		System.out.println();
	}
	
}
}
