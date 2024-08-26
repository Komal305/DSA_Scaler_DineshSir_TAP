package javaGraph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class GraphL {

	private LinkedList<Integer>[] obj;
	private int v;
	private int e;
	
	public GraphL(int nodes) {
		this.v=nodes;
		this.e=0;
		this.obj = new LinkedList[nodes];
		for(int i=0; i<v; i++) {
			obj[i]=new LinkedList<>();
		}
		
	}
	
	public void addEdge( int u, int v) {
		obj[u].add(v);
		obj[v].add(u);
		e++;
	}
	
	public String toString() {
		StringBuilder sb=new StringBuilder();
		sb.append(v+" vertex "+e+ "edges"+ "\n");
		for(int i=0; i<v; i++) {
			sb.append(i+": ");
			for(int w:obj[i]) {
				sb.append(w+" ");
			}
			sb.append("\n");
		}
		return sb.toString();
	}
	
	public void Bfs(int s) {
		boolean[] visited=new boolean[v];
		Queue<Integer> q=new LinkedList<>();
		q.offer(s);
		visited[s]=true;
		
		while(!q.isEmpty()) {
			int u=q.poll();
			System.out.print(u+" ");
			for(int v:obj[u]) {
				if(!visited[v]) {
					visited[v]=true;
					q.offer(v);
				}
			}
		}
		
	}
	
	public void Dfs(int s) {
		boolean[] visited=new boolean[v];
		Stack<Integer> st=new Stack<>();
		st.push(s);
		System.out.println();
		while(!st.isEmpty()) {
			int u=st.pop();
			if(!visited[u]) {
			visited[u] = true;
			System.out.print(u+" ");
			for(int v:obj[u]) {
			if(!visited[v]) {
				st.push(v);
			}
			}
			}
		}
	}

	public static void main(String[] args) {
		GraphL g=new GraphL(5);
		g.addEdge(0, 1);
		g.addEdge(1, 2);
		g.addEdge(2, 3);
		g.addEdge(3, 0);
		g.addEdge(2, 4);
		g.Bfs(2);
		g.Dfs(2);
//System.out.println(g);
	}

}
