package cap8.funcao_alta_ordem

fun main(args: Array<String>) {
	
	//Declaração sem inferencia de tipos
	val f1:(String, String) -> String = {name, lastname -> "$name $lastname"}
	
	println(f1("java", "kotlin"))
	
	//Declaração com inferencia de tipos
	val f2 = {name:String, lastname:String -> "$name $lastname"}
	
	println(f2("kotlin", "java"))
	
	//Declaração para unit values
	val unit:(String) -> Unit = {content -> println(content)}
	
	unit("kotlin")
	
	//Declaração com null values nos parametros
	val withNull = {name:String, lastname:String? -> if(lastname == null) "$name | Sem sobrenome....." else "$name $lastname"}
	
	println(withNull("kotlin", "Go"))
	println(withNull("kotlin", null))
}