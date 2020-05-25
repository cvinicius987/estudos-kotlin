package cap11.dsl

//Função com parametro de receptor
//a funçao action vira de extensão da StringBuilder somente no escopo dess função
fun buildStringCreateReceptor(action:StringBuilder.() -> Unit):String{
	
	val sb = StringBuilder()
	
	sb.action()
	
	return sb.toString()
}

fun main(args: Array<String>) {
	
	//Função criada
	val fn = buildStringCreateReceptor {  append("Java ")
				 				   		  append("Kotlin")}

	println(fn)
}