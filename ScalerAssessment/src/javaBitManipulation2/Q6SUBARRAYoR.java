package javaBitManipulation2;

public class Q6SUBARRAYoR {

	public static void main(String[] args) {
		
	int[]	A = {1, 2, 3, 4, 5};
		int total=0;
        for(int i=0; i<A.length; i++){
            int sum = A[i];
            for(int j=i+1; j<A.length; j++){
            	System.out.print("sum "+sum);
            	total +=sum;
                sum ^= (A[i]^A[j]);
                System.out.println("total "+total);
                
            }
        }
System.out.println(total);
	}

}
//Value([1]) = 1
//Value([1, 2]) = 3
//Value([1, 2, 3]) = 3
//Value([1, 2, 3, 4]) = 7
//Value([1, 2, 3, 4, 5]) = 7
//Value([2]) = 2
//Value([2, 3]) = 3
//Value([2, 3, 4]) = 7
//Value([2, 3, 4, 5]) = 7
//Value([3]) = 3
//Value([3, 4]) = 7
//Value([3, 4, 5]) = 7
//Value([4]) = 4
//Value([4, 5]) = 5
//Value([5]) = 5
//Sum of all these values = 71
