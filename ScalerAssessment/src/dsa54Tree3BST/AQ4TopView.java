package dsa54Tree3BST;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

class Pair{
	int hd;
	TreeNode node;
	public Pair(TreeNode node, int hd) {
		this.node=node;
		this.hd=hd;
	}
}

public class AQ4TopView {

	public static void main(String[] args) {
		 TreeNode root = new TreeNode(1);
	        root.left = new TreeNode(2);
	        root.right = new TreeNode(3);
	        root.left.left = new TreeNode(4);
	        root.right.right = new TreeNode(5);
		TopView(root);
	}
	
	static public ArrayList<Integer> TopView(TreeNode A){
		ArrayList<Integer> ans=new ArrayList<>();
		if(A==null) return ans;
		Map<Integer, Integer> map=new TreeMap<>();
		Queue<Pair> q=new LinkedList<Pair>();
		q.add(new  Pair(A, 0));
		
		while( !q.isEmpty() ) {
			Pair it=q.remove();
			int hd=it.hd;
			
			TreeNode t=it.node;
			
			if(map.get(hd) == null)
				map.put(hd, t.val);
			
			if(t.left !=null)
				q.add(new Pair(t.left, hd-1));
			if(t.right != null)
				q.add(new Pair(t.right, hd+1));
		}
		
		for(Map.Entry<Integer, Integer> e: map.entrySet() )
			ans.add(e.getValue());
		
		ans.forEach(System.out::print);
		
		return ans;
	}

}
