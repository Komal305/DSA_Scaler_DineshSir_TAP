package javaBitManipulation2;

public class AQ3SumofXorofallPairs {

	public static void main(String[] args) {
		 int[] A= {3, 4, 2};
		        final int mod = (int)(1e9 + 7);    
		        int n = A.length;
		        long ans = 0;
		        
		        
		        
		        for(int j = 0; j < 32; j++){
		            long zero = 0, one = 0, temp;
		            
		            
		            for(int i = 0; i < n; i++){
		                if (A[i] % 2 == 0)
		                    zero++;//2,  1  ,2,3
		                else
		                    one++;// 1,  2,  1
		                A[i] /= 2; // {3, 4, 2} {1,2,1} {0,1,0}, {0,0,0}
		          
		            }
		            temp = zero * one * (1 << j);//2*1*1=2, 2*1*2=4, 2*1*4=8, 
		            ans = (ans + temp) ;        //0+2=2,    2+4=6,   6+8=14,  
		          System.out.println(ans); 
		        }
		       // return (int)(ans);
		      
		    }
		

	}

/*Given an array A of N integers. Find the sum of bitwise XOR all pairs of numbers in the array.
 8421
 0001=0,1
 0010=1,2
 0100=2,4
 1000=3,8

Since the answer can be large, return the remainder after the dividing the answer by 109+7.



Problem Constraints
1 <= N <= 105

1 <= A[i] < 109



Input Format
Only argument A is an array of integers



Output Format
Return an integer denoting the sum of xor of all pairs of number in the array.



Example Input
Input 1:
A = [1, 2, 3]
Input 2:
A = [3, 4, 2]


Example Output
Output 1:
6
Output 2:
14


Example Explanation
For Input 1:
Pair    Xor
{1, 2}  3
{1, 3}  2
{2, 3}  1
Sum of xor of all pairs = 3 + 2 + 1 = 6.
For Input 2:
Pair    Xor
{3, 4}  7
{3, 2}  1
{4, 2}  6
Sum of xor of all pairs = 7 + 1 + 6 = 14.*/