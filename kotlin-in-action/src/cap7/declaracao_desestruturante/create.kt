package cap7.declaracao_desestruturante

class Fullname(val name:String, val lastName:String){
	
	operator fun component1() = name
	
	operator fun component2() = lastName
}

fun main(args: Array<String>) {
	
	val fullname = Fullname("caio", "vinicius")
	
	val (name, lastname) = fullname
	
	print("$name - $lastname")
}