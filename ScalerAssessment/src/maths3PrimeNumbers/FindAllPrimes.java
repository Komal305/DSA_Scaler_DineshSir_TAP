package maths3PrimeNumbers;

public class FindAllPrimes {
public static void main(String[] args) {
	System.out.print(solve(12));
}
public static int[] solve(int A) {
boolean[] b=new boolean[A+1];
b[0]=true;
b[1]=true;
for(int i=2; i*i<=A; i++){
    if(b[i]==false){
        for(int j=i*i; j<=A; j=j+i){
b[j]=true;
        }
    }
}

int count=0;
     for(int i=1; i<=A; i++){
         if(b[i]==false)
         count++;
     }  

int[] ans=new int[count];
int j=0;
for(int i=2; i<=A; i++){
    	if(b[i]==false)
    ans[j++]=i;
}
for(int n:ans)System.out.println(n+" ");
        return ans;
    }
}