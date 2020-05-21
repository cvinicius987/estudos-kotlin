package cap11.dsl

//Fun��o com parametro de receptor
//a fun�ao action vira de extens�o da StringBuilder somente no escopo dess fun��o
fun buildStringCreateReceptor(action:StringBuilder.() -> Unit):String{
	
	val sb = StringBuilder()
	
	sb.action()
	
	return sb.toString()
}

fun main(args: Array<String>) {
	
	//Fun��o criada
	val fn = buildStringCreateReceptor {  append("Java ")
				 				   		  append("Kotlin")}

	println(fn)
}