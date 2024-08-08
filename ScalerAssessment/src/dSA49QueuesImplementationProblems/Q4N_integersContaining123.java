package dSA49QueuesImplementationProblems;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class Q4N_integersContaining123 
{

	public static void main(String[] args) 
	{
       int A=10;
       Deque<Integer> d=new LinkedList<>();
       d.add(1);
       d.add(2);
       d.add(3);
      Deque<Integer> ans = new  LinkedList<>();
//      while(!d.isEmpty())
//      ans.add(d.getFirst());
      
int count=1;
       for(int i=1; i<=A; i++)
       {
           ans.add(d.getFirst());
           while(!d.isEmpty() && count<=3){
           d.add(d.getFirst()*10+count++);
           d.removeFirst();
           }
           
	}
     System.out.println(d);  
	}
}
