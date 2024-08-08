package dsa54Tree3BST;
//class TreeNode {
//	      int val;
//	      TreeNode left;
//	      TreeNode right;
//	      TreeNode(int x) {
//	       val = x;
//	       left=null;
//	       right=null;
//	     }
//	  
//}

public class Q2DeleteNodeBst {

	public static void main(String[] args) {}
		// TODO Auto-generated method stub
		    public TreeNode solve(TreeNode A, int B) {
		        if(A== null){
		            return A;
		        }

		        if(B<A.val)
		        A.left = solve(A.left, B);
		        else if(B>A.val)
		        A.right = solve(A.right, B);
		        else{
		            if(A.left==null) return A.right;
		            if(A.right==null) return A.left;

		            TreeNode temp=A.left;
		            while(temp.right!=null){
		                temp=temp.right;
		            }
		            A.val=temp.val;
		            
		            A.left = solve(A.left, temp.val);
		        }
		        return A;

	}
	
	///
}

