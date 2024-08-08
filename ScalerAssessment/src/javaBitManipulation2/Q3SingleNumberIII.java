package javaBitManipulation2;

public class Q3SingleNumberIII {

	public static void main(String[] args) {
		 int[] A= {1, 2, 3, 1, 2, 4};
			
		        int aXorb = 0; // the result of a xor b
		        for (int item: A) {
		            aXorb ^= item;
		        System.out.println(aXorb);
		        }
		        
		        int lastBit = (aXorb & (aXorb - 1)) ^ aXorb; // the last bit that a differs from b
		        System.out.println(lastBit);
		        
		        int intA = 0, intB = 0;
		        
		        for (int item: A) {
		            // based on the last bit, group the items into groupA (include a) and groupB
		            if ((item & lastBit) != 0)
		                intA ^= item;
		            else
		                intB ^= item;
		        
		        }
		        
		        int[] ans = new int[2];
		        ans[0] =  Math.min(intA, intB);
		        ans[1] = Math.max(intA, intB);
		       // return ans;
			   for(int n:ans)      System.out.print(n+" ");
	}

}
