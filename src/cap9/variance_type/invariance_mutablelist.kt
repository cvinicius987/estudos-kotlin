package cap9.variance

//Nesse caso o compilador permite devido a Ao tipo ser Any, e a List ser imutavel e readonly
fun listNames(list:List<Any>){
	
	println(list.joinToString())	
}

//Nesse caso o compilador NÂO permite devido a MutableList permite uma adição de varios objetos distintos
fun listNamesNew(list:MutableList<Any>){
	
	println(list.joinToString())	
}

fun main(args: Array<String>) {
	
	listNames(listOf("java", "kotlin", "golang"))
	
	//Não compila devido a restrição com mutableList
	//listNamesNew(listOf("java", "kotlin", "golang"))
}