package JavaHashing;

public class HashTable {
	private HashNode[] buckets;
	private int numOfBuckets;
	private int size;
	
	public HashTable() {
		this(10);
	}
	
	

	public HashTable(int capacity) {
this.numOfBuckets=capacity;
this.buckets=new HashNode[numOfBuckets];
this.size=0;
	}
	
	private class HashNode{
		private Integer key;
		private String value;
		private HashNode next;
		
		public HashNode(Integer key, String value)
		{
			this.key=key;
			this.value=value;
		}
	}
		public int size() {
			return size;
		}
		public boolean isEmpty() {
			return size==0;
		}
		
		public void put(Integer key, String value) {
		if(key==null || value==null)throw new IllegalArgumentException("key value is null bro");
		
		int bucketIndex = getBucketIndex(key);
		HashNode head=buckets[bucketIndex];
		
		while(head != null)
		{
			if(head.key.equals(key)) {
				head.value=value;
				return;
			}
			head=head.next;
		}
		size++;
		head = buckets[bucketIndex];
		HashNode node=new HashNode(key, value);
		node.next=head;
		buckets[bucketIndex] = node;
		
		}
		
		private int getBucketIndex(Integer key2) {
			return key2%numOfBuckets;
		}

		public String get(Integer key) {
			
			if(key==null) throw new IllegalArgumentException("key is null bro");
			int bucketIndex=getBucketIndex(key);
			HashNode head=buckets[bucketIndex];
			while(head != null)
			{
				if(head.key.equals(key)) return head.value;
				
				head=head.next;
			}
			
			return null;
		}
		
		public String remove(Integer key) {
			if(key==null) throw new IllegalArgumentException("No key to be remove");
			
			int bucketIndex=getBucketIndex(key);
			HashNode head= buckets[bucketIndex];
			HashNode temp=null;
			while(head != null) {
				if(head.key.equals(key)) break;
				
					temp=head;
					head=head.next;
			}
			if(head==null) return null;
					size--;
					
					if(temp != null) temp.next=head.next;
					else buckets[bucketIndex]=head.next;
					
			return head.value;
		}
		public static void main(String[] args) {
			HashTable t=new HashTable(10);
			t.put(11,"komal");
			t.put(21, "rani");
			t.put(112,"Bhagya");
			t.put(213, "Shree");
			System.out.println(t.size());
			
			//System.out.println(t.get(null));
			System.out.println(t.get(101));
			
			System.out.println(t.remove(112));
			System.out.println(t.remove(21));
			System.out.println(t.remove(1));
			System.out.println(t.remove(null));
			
		}
	}


