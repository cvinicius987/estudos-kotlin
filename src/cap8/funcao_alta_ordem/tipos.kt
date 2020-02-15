package cap8.funcao_alta_ordem

fun main(args: Array<String>) {
	
	//Declara��o sem inferencia de tipos
	val f1:(String, String) -> String = {name, lastname -> "$name $lastname"}
	
	println(f1("java", "kotlin"))
	
	//Declara��o com inferencia de tipos
	val f2 = {name:String, lastname:String -> "$name $lastname"}
	
	println(f2("kotlin", "java"))
	
	//Declara��o para unit values
	val unit:(String) -> Unit = {content -> println(content)}
	
	unit("kotlin")
	
	//Declara��o com null values nos parametros
	val withNull = {name:String, lastname:String? -> if(lastname == null) "$name | Sem sobrenome....." else "$name $lastname"}
	
	println(withNull("kotlin", "Go"))
	println(withNull("kotlin", null))
}