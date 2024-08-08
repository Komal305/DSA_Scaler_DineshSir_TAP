package arraysJava;

public class max {
public static void main(String[] args) {
	int[] A={1,2,2,3,1};
	 int r=-71;
	 System.out.println(pow(r));
//     for(int i=0; i<A.length; i++){
//       
//         System.out.print(r+" "+A[i]+" =");
//         r = r^A[i];
//         System.out.println( r);
//         } 
}

public static int pow(int n) {
	if(n<=1) { return n;}
	
	
	return pow(n-1)+pow(n-2);
	
}
}