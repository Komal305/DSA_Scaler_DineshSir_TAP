import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class Solution {
	
	public static void main(String[] args) {
		int[]  A= {1, 3, 2, 3, 3};
		int[] B= {5, 6, 1, 3, 9};
		Solution s = new Solution();
	    int result = s.solve(A, B);
	    System.out.println("Maximum Profit: " + result);
	}
	
	
	
    public int solve(int[] A, int[] B) {
        int mod = (int)1e9 + 7;
        int n = A.length;
        PriorityQueue < Integer > pending = new PriorityQueue<Integer>(Collections.reverseOrder());
    
        ArrayList<pair> v = new ArrayList<pair>();
    
        for (int i = 0; i < n; i++){
            v.add(new pair(A[i], B[i]));
        }
        
        
        System.out.println("Before sorting:");
        for (pair p : v) {
            System.out.println("Deadline: " + p.first + ", Profit: " + p.second);
        }

        Collections.sort(v);

        System.out.println("After sorting:");
        for (pair p : v) {
            System.out.println("Deadline: " + p.first + ", Profit: " + p.second);
        }
    
        int ans = 0;
        int tim = v.get(n-1).first - 1;
        for (int i = n - 1; i >= 0; i--) {
            while (tim >= v.get(i).first && pending.size() > 0) {
                tim--;
                ans = (ans + pending.poll()) % mod;
            }
            if (pending.size() == 0)
                tim = v.get(i).first - 1;
            pending.add(v.get(i).second);
        }
        while (tim >= 0 && pending.size() > 0) {
            tim--;
            ans = (ans + pending.poll()) % mod;
        }
        return ans;
    }
    class pair implements Comparable <pair> {
        int first;
        int second;
        public pair(int a, int b){
            this.first = a;
            this.second = b;
        }
        //@Override
        public int compareTo(pair b){
            if(this.first == b.first)
                return -(b.second - this.second);
            else
                return -(b.first - this.first);
        }
    }
}
