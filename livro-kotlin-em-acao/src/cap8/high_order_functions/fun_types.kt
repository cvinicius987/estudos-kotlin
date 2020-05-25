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
	
	//Declara��o de um tipo fun��o que pode ser null
	var funNull:((String, String) -> Unit)? = null
	
	funNull = {name, lastname -> println("$name | $lastname")}
	
	funNull("Kotlin", "Jetbrains")
	
	//Declara��o recebendo uma function ao inv�s de lambda
	val funLocal:(String) -> Int = fun(value):Int{
		return value.length
	}
	
	println(funLocal("Kotlin em A��o"))
}