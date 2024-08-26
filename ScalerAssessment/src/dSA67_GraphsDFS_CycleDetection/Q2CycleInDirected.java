package dSA67_GraphsDFS_CycleDetection;

import java.util.ArrayList;

public class Q2CycleInDirected {
static int maxn=100009;
static ArrayList<ArrayList<Integer>> adj;

static int[] visited=new int[maxn];
static int[] revisited=new int[maxn];

public static void graph() {
	adj=new ArrayList<ArrayList<Integer>>();
	for(int i=0; i<maxn; i++)
	{
		visited[i]=0;
		revisited[i]=0;
		adj.add(new ArrayList<Integer>());
	}
}

static int solve(int A, int[][] B){
	graph();
	for(int[] row:B) 
		adj.get(row[0]).add(row[1]);
	
		for(int i=1; i<=A; i++) {
			if(visited[i]==0 && IsCycleUtil(i) )
return 1;
		}
		
	
	return 0;
}
	private static boolean IsCycleUtil(int v) {
	if(visited[v]==0) {
		visited[v]=1;
		revisited[v]=1;
		
		//System.out.println(adj.get(v));
		for(int u:adj.get(v)) {
		
			if(visited[u]==0 && IsCycleUtil(v))
				return true;
			else if(revisited[v]==1)
				return true;
		}
	}
	revisited[v]=0;
	return false;
}

	public static void main(String[] args) {
		int A=5;
		int[][] B= {{1, 2},{4, 1}, {2, 4}, {3, 4},{5, 2},{1, 3}};
		            System.out.println(solve(A, B));     
		           	                
	}

}
