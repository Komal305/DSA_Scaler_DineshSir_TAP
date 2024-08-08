package arraysJava;

public class FindMissingNumber {
	public static void main(String[] args) {
	int[] a= {1,2,3,4,5,7};
	findMissedNum(a);
	}
	public static void findMissedNum(int[] a) {
		int n=a.length+1;
		int sum=n*(n+1)/2;
		for(int arr:a)sum-=arr;
		System.out.println(sum);
	}
}
