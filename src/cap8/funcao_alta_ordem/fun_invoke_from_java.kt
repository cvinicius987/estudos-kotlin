package cap8.funcao_alta_ordem

fun invokeFromJava(msg:String, convertToInt:(String) -> Int) = println(convertToInt(msg))

fun main(args: Array<String>) {
	
	invokeFromJava("teste invoke.", {str:String -> str.length})
	
	invokeFromJava("teste invoke..", {str -> str.length})
	
	invokeFromJava("teste invoke...", {it.length})
	
	invokeFromJava("teste invoke....") {it.length}
	
	invokeFromJava("teste invoke.....", String::length)
}