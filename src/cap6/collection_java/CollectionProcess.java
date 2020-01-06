package cap6.collection_java;

import java.util.ArrayList;
import java.util.List;

public class CollectionProcess {

	public static void convertContentToUppercase(List<String> list) {
	
		for (int i = 0; i < list.size(); i++) {
			list.set(i, list.get(i).toUpperCase());
		}
	}
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Java");
		list.add("Kotlin");
		list.add("Ruby");
		list.add("Go");
	
		Java_coll_to_kotlinKt.changeToUppercase(list);
		
		list.forEach(System.out::println);
	}
}