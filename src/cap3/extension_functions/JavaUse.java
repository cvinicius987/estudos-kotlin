package cap3.extension_functions;

import java.util.Arrays;

public class JavaUse {

	public static void main(String[] args) {
		
		System.out.println(BasicKt.lastChar("Name"));
		
		System.out.println(Extension_fun_collectionKt.joinToString(Arrays.asList(1,2,3,4,5), "|", ",", "|"));
	}
}