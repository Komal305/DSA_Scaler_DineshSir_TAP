package javaTreeTUF;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;



class TreeNode{
	TreeNode left;
	TreeNode right;
	int val;
	public TreeNode(){}
	
	public TreeNode(int val) {
		this.val= val;
	}
	public TreeNode(TreeNode left, TreeNode right, int val) {
		super();
		this.left = left;
		this.right = right;
		this.val = val;
	}
	
}

public class PostOrderTraversal {

	public static void main(String[] args) {
		
	}
	
	public List<Integer> PostOrder(TreeNode A){
		List<Integer> po=new ArrayList<>();
		Stack<TreeNode> s1=new Stack<TreeNode>();
		Stack<TreeNode> s2=new Stack<TreeNode>();
		
		if(A==null) return po;
		
		s1.push(A);
		while(!s1.isEmpty()) {
			A = s1.pop();
			s2.add(A);
			if(A.left != null) s1.push(A.left);
			if(A.right != null) s2.push(A.right);	
		}
		
		while(!s2.isEmpty()) {
			po.add(s1.peek().val);
			s1.pop();
		}
		
		return po;
	}
	
	
}
