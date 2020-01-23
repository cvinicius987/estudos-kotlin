package cap3.declaration

//Pair estrutura semelhante as tuplas
val pair1 = Pair("nome", "Caio")

val pair2 = "language" to "Kotlin"

fun main(args: Array<String>) {
	
	val (nome1, value1) = pair1
	
	println(pair1)
	println("Nome: $nome1 - Value: $value1")
	
	val (nome2, value2) = pair2
	
	println(pair2)
	println("Nome: $nome2 - Value: $value2")
}