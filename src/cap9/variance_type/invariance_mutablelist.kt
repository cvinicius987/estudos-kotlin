package cap9.variance

//Nesse caso o compilador permite devido a Ao tipo ser Any, e a List ser imutavel e readonly
fun listNames(list:List<Any>){
	
	println(list.joinToString())	
}

//Nesse caso o compilador N�O permite devido a MutableList permite uma adi��o de varios objetos distintos
fun listNamesNew(list:MutableList<Any>){
	
	println(list.joinToString())	
}

fun main(args: Array<String>) {
	
	listNames(listOf("java", "kotlin", "golang"))
	
	//N�o compila devido a restri��o com mutableList
	//listNamesNew(listOf("java", "kotlin", "golang"))
}