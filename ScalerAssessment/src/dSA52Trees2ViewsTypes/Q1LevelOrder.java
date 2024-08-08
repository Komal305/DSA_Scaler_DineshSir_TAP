package dSA52Trees2ViewsTypes;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class TreeNode{
	TreeNode left;
	TreeNode right;
	int val;
	
	TreeNode(int val)
	{
		this.val=val;
		this.left=null;
		this.right=null;
	}
}

public class Q1LevelOrder {

	public static void main(String[] args)
	{
	  TreeNode root1=new TreeNode(3);
	  root1.left=new TreeNode(9);
	  root1.right=new TreeNode(20);
	  root1.right.left=new TreeNode(15);
	  root1.right.right=new TreeNode(7);
	  
	levelOrder(root1);

	}
	
	static ArrayList<ArrayList<Integer>>  levelOrder(TreeNode A) {
		ArrayList<ArrayList<Integer>>  ans=new ArrayList<>();
		if(A==null) return ans;
		Queue<TreeNode> q=new LinkedList<>();
		q.add(A);
		
		while(!q.isEmpty())
		{
			int level= q.size();

	        System.out.println();
			ArrayList<Integer> currLev=new ArrayList<>();
			for(int i=0; i<level; i++)
			{
				TreeNode currNode=q.poll();
				//System.out.println(currNode.val);
				currLev.add(currNode.val);
				
				if(currNode.left!=null)
					q.add(currNode.left);
				
				if(currNode.right!=null)
					q.add(currNode.right);
			}
			ans.add(currLev);
			
		}
		
		return ans;
		
	}

}
/*
Given a binary tree, return the level order traversal of its nodes' values. (i.e., from left to right, level by level).



Problem Constraints
1 <= number of nodes <= 105



Input Format
First and only argument is root node of the binary tree, A.



Output Format
Return a 2D integer array denoting the level order traversal of the given binary tree.



Example Input
Input 1:

    3
   / \
  9  20
    /  \
   15   7
Input 2:

   1
  / \
 6   2
    /
   3


Example Output
Output 1:

 [
   [3],
   [9, 20],
   [15, 7]
 ]
Output 2:

 [ 
   [1]
   [6, 2]
   [3]
 ]


Example Explanation
Explanation 1:

 Return the 2D array. Each row denotes the traversal of each level.
*/