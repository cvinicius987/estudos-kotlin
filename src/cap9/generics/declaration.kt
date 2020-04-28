package cap9.generics

fun main(args: Array<String>) {
	
	//Listas vazias genericas
	val list:List<String> = listOf()
	val list2 = listOf<String>()
	
	val list3:MutableList<String> = mutableListOf("")
	
	//Erro de compilação pois não podemos passar uma lista mutavel com um subtipo
	//teste(list3)
}

fun teste(t:MutableList<Any>){
	
}