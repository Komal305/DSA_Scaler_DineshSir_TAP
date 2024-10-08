package javaGraph;

public class Graph {
private int v;
private int e;
private int[][] mat;
	public Graph(int nodes) {
		this.v=nodes;
		this.e=0;
		this.mat=new int[nodes][nodes];
	}
	
	public void addEdge(int u, int v)
	{
		mat[u][v]=1;
		mat[v][u]=1;
		e++;
	}
	
	public String toString() {
		StringBuilder sb=new StringBuilder();
		sb.append(v+" vertices "+e+ " edges"+"\n");
		for(int i=0; i<v; i++) {
			sb.append(i+ ": " );
			for(int w:mat[i]) {
				sb.append(w+" ");
			}
			sb.append("\n");
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		Graph g=new Graph(4);
		g.addEdge(0, 1);
		g.addEdge(1, 2);
		g.addEdge(2, 3);
		g.addEdge(3, 0);
System.out.println(g);
	}

}
