package cap6.collection.mutable_readonly;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollMutableJava {

	public static void main(String[] args) {
						
		List<Integer> ints = Collections.unmodifiableList(Arrays.asList(1,2,3,4,5));
		
		ints.remove(1);
		ints.add(45);
		
		ints.forEach(System.out::println);
	}
}