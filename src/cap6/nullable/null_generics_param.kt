package cap6.nullable

//Tipo T PODE receber null
fun <T> printObjNull(t:T){
	
	println(t?.toString())
}

//Tipo T NÂO PODE receber null
fun <T : Any> printObjNotNull(t:T){
	
	println(t.toString())
}

fun main(args: Array<String>) {
	
	printObjNull(null)
	
	printObjNotNull("teste")
}