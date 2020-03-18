package cap8.funcao_alta_ordem;

import kotlin.jvm.functions.Function1;

public class ExecuteFunctionKT {

	public static void main(String[] args) {
		
		//Java 7 ou inferior
		Fun_invoke_from_javaKt.invokeFromJava("Kotlin", new Function1<String, Integer>() {

			@Override
			public Integer invoke(String arg0) {
				return arg0.length();
			}
		});
		
		//Java 8 ou superior
		Fun_invoke_from_javaKt.invokeFromJava("Java Server Faces", str -> str.length());
		
		Fun_invoke_from_javaKt.invokeFromJava("JSP & Servlets", String::length);
	}
}