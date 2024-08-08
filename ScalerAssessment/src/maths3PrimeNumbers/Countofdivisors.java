package maths3PrimeNumbers;

public class Countofdivisors {

	public static void main(String[] args) {
		int[] A= {8, 9, 10};
		int[] ans=new int[A.length];

        for(int i=0; i<A.length; i++){
            int count=0;
            for(int j=1;j*j<=A[i]; j++){
           if( A[i]%j==0)
           count+=2;
           
           if(j*j==A[i])count--;
            }

            ans[i]=count;
        }
        for(int n:ans)System.out.println(n+" ");
	}

}
