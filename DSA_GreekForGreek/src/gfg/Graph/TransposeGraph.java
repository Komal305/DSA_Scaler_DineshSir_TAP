package gfg.Graph;

import java.util.ArrayList;

public class TransposeGraph {

	private static int vertices = 5;
	static ArrayList<Integer>[] adj = new ArrayList[vertices];
	static ArrayList<Integer>[] tr = new ArrayList[vertices];
	
	static void addEdge(int u, int v, boolean choice) {
		if(!choice) adj[u].add(v);
		else tr[u].add(v);
	}
	
	static void Transpose() {
		for(int i=0; i<vertices; i++) {
			for(int j=0; j<adj[i].size(); j++) {
				addEdge(adj[i].get(j), i, true);
			}
		}
	}
	
//    0
//   /|\
//  / | \
// 2  |  1
//  \ | /
//   \|/
//    3
//   / \
//  /   \
// 4----->

	
	static void printGraph(){
		for(int i=0; i<vertices ; i++) {
			System.out.print(i+"--> ");
			for(int j=0; j<tr[i].size(); j++) 
				System.out.print(tr[i].get(j)+" ");
				System.out.println();
		}
	}
	public static void main(String[] args) {
		for(int i=0; i<vertices; i++) {
			adj[i] = new ArrayList<Integer>();
			tr[i] = new ArrayList<Integer>();
		}
		
		addEdge(0, 1, false); addEdge(0, 4, false); addEdge(0, 3, false); addEdge(2, 0, false);
		addEdge(3, 2, false); addEdge(4, 1, false); addEdge(4, 3, false);
		
		printGraph();
		
//	    0
//	    /|\
//	   / | \
//	  1  |  4
//	     |  / \
//	     | /   \
//	     2     3
//	      \   /
//	       \ /


		Transpose();
		printGraph();
	}

}
