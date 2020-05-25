package cap8.high_order_functions

fun invokeFromJava(msg:String, convertToInt:(String) -> Int) = println(convertToInt(msg))

fun main(args: Array<String>) {
	
	invokeFromJava("teste invoke.", {str:String -> str.length})
	
	invokeFromJava("teste invoke..", {str -> str.length})
	
	invokeFromJava("teste invoke...", {it.length})
	
	invokeFromJava("teste invoke....") {it.length}
	
	invokeFromJava("teste invoke.....", String::length)
}