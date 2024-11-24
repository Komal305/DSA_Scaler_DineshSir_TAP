 package assesmentsQuestion;
import java.util.*;


 class Interval {
	      int start;
	     int end;
	     Interval() { start = 0; end = 0; }
	     Interval(int s, int e) { start = s; end = e; }
	  }
	 
	 
	public class IntervalsProblem {
		public static void main(String[] args) {
			Interval[] intervals1 = {
		            new Interval(1, 3),
		            new Interval(2, 6),
		            new Interval(8, 10),
		            new Interval(15, 18)
		        };

		        Interval[] mergedIntervals1 = merge(intervals1);
		        System.out.println("Merged Intervals 1:");
		        for (Interval interval : mergedIntervals1) {
		            System.out.println("[" + interval.start + ", " + interval.end + "]");
		        }

		        // Another example
		        Interval[] intervals2 = {
		            new Interval(1, 4),
		            new Interval(2, 3)
		        };

		        Interval[] mergedIntervals2 = merge(intervals2);
		        System.out.println("Merged Intervals 2:");
		        for (Interval interval : mergedIntervals2) {
		            System.out.println("[" + interval.start + ", " + interval.end + "]");
		        }
		    
			
		}
		
	    public static Interval[] merge(Interval[] intervals) {
	        Arrays.sort(intervals, (a,b)-> Integer.compare(a.start,b.start));
	        List<Interval> m=new ArrayList<>();
	        Interval c=intervals[0];
	        m.add(c);
	        for(Interval a:intervals){
	            int ce=c.end;
	            int ns=a.start;
	            int ne=a.end;
	            if(ce>=ns)
	            c.end=Math.max(ce,ne);
	            else{
	            c=a;
	            m.add(c);
	            }
	            
	        }
	        return m.toArray(new Interval[m.size()]);
	    }
	}