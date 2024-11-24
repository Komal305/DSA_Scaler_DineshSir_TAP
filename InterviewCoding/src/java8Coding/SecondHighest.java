package java8Coding;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class SecondHighest {
public static void main(String[] args) {
	List<Integer> l = Arrays.asList(1, 1,22,3,4,22,45, 45, 45);
	
	Optional<Integer> op = l.stream().distinct().skip(1).findFirst();
	//System.out.println(op.get());
	
	List<Integer> sorted = l.stream().distinct().sorted().skip(1).collect(Collectors.toList());
	//  sorted.forEach(System.out::println);
	
	@SuppressWarnings("removal")
	Integer a = new Integer(5);
	
	System.out.println(++a );
	}
}
