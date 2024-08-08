package dSA42LinkedList1ntroduction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class AQ3RemoveNthNodefromListEnd {
	 class ListNode {
		      public int val;
		     public ListNode next;
		     ListNode(){}
		     ListNode(int x) { val = x; next = null; }
		  }
	
	public static void main(String[] args) {
		//ListNode n=new ListNode();
		ArrayList<String> a=new ArrayList<>();
		
		//"cat", "bat", "could", "but"
		a.add("cat");
		a.add("bat");
		a.add("could");
		a.add("but");
		//List<Integer> link=new LinkedList<>();
		Map<String, Integer> m=new TreeMap<>();
		for(String i:a) {
			m.putIfAbsent(i, i.length());
		}
		
		for (Map.Entry<String, Integer> e : m.entrySet()) {
            a.add(e.getKey());
        }
		
		Collections.sort(a);
		System.out.println(a+" -");
		//removeNthFromEnd(null, 0);
	}
	
	static public ListNode removeNthFromEnd(ListNode A, int B) {
		if(A.next==null) return null;

		int count=1;
		while(A!=null){
		    A=A.next;
		    count++;
		}
		        //ListNode rev= reverse(A);
		if(B>count) return A;
		return A;
	}

}
