package cap11.dsl

fun buildStringCreate(action:(StringBuilder) -> Unit):String{
	
	val sb = StringBuilder()
	
	action(sb)
	
	return sb.toString()
}

fun main(args: Array<String>) {
	
	//Função criada
	val fn = buildStringCreate { it.append("Java ")
				 				   .append("Kotlin")}
	
	println(fn)
}