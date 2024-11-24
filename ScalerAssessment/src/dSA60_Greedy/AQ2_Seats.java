package dSA60_Greedy;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class AQ2_Seats {
public static void main(String[] args) {
	String A = "....x..xx...x..";
	int n = A.length();
	List<Integer> pos = new ArrayList<Integer>();
	
	for(int i=0; i<n; i++) {
		if(A.charAt(i)=='x') pos.add(i); 
	}
	//pos.forEach(System.out::println);//4,7,8,12
	
	int nn = pos.size(); //4
	int m = nn/2;//2
	int mid = pos.get(m);//8
	
    
    int ans =0;
     for(int i=0; i<nn; i++) {
    	 int t = mid - m + i;//8-2+0
    	 ans += Math.abs(pos.get(i)-t); // 4-6 = 2,  7-7,8-8, 12-9 2+3
     }
    
	
	System.out.println(mid);
}
}
