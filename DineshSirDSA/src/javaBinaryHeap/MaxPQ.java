package javaBinaryHeap;

public class MaxPQ {
private Integer[] heap;
private int n;
	public MaxPQ(int capacity) {
		heap = new Integer[capacity+1];
	}
	
	public boolean isEmpty() {
		return n==0;
	}
	
	public int size() {
		return n;
	}
	
	public void insert(int x){
		if(n==heap.length-1) {
			resize(2*heap.length);
		}
		n++;
		heap[n]=x;
		swim(n);
	}
	
	private void resize(int n) {
		
		Integer[] temp=new Integer[n];
		for(int i=0; i<heap.length; i++) {
			temp[i] = heap[i];
		}
		heap=temp;
		
	}

	private void swim(int k) {
		while(k >1 && heap[k/2] < heap[k]) {
			int temp = heap[k];
			heap[k] = heap[k/2];
			heap[k/2]=temp;
		}
		
	}
	
	public int deleteMax() {
		int max = heap[1];
		swap(1,n);
		n--;
		sink(1);
		heap[n+1]=null;
		if(n>0 && (n==(heap.length-1)/4)) {
			resize(heap.length/2);
		}
		return max;	
	}
	
	
	private void sink(int k) {
	while(2*k<=n) {
		int j=2*k;
		if(j<n && heap[j] < heap[j+1]) {
			break;
		}
		swap(k,j);
		k=j;
	}
		
	}

	private void swap(int a, int b) 
	{
		int t=heap[a];
		heap[a]=heap[b];
		heap[b]=t;	
	}

	public void printMaxPQ() {
		for(int i=1; i<heap.length; i++) {
			System.out.print(heap[i]+" ");
		}
	}

	public static void main(String[] args) {
		MaxPQ pq=new MaxPQ(3);
		System.out.println(pq.size());
		System.out.println(pq.isEmpty());
		pq.insert(9);
		pq.insert(9999);
		pq.insert(99);
		pq.insert(999);
		pq.insert(999999);
		pq.insert(99999);
		pq.printMaxPQ();
		System.out.println();
		System.out.println(pq.size());
		System.out.println(pq.isEmpty());
	}

}
