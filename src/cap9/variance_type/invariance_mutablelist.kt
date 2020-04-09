package cap9.variance

//Nesse caso o compilador permite devido a Ao tipo ser Any, e a List ser imutavel e readonly
//Portanto podemos passar uma MutableList
fun receiveList(list:List<Any>){
	
	println(list.joinToString())	
}

//Nesse caso o compilador NÂO permite devido a MutableList
//List é readonly portanto não podemos passar List
fun receiveMutable(list:MutableList<Any>){
	
	println(list.joinToString())
}

fun main(args: Array<String>) {
	
	/*
     * Onde esperamos uma List podemos passar uma MutableList, pois esta herda List e apenas não será utilizado os metodos de escrita
     * A regra de genrics aqui é valida, pois mesmo esperando um List<Any> podemos passar uma List<String>,
     *
     * Aqui isso é valido porque List é readonly e não corre risco de adição de dados fora da hirerquia correta
     */
	val listStr:List<String> = listOf("java", "kotlin", "golang")
	
	receiveList(listStr)
	
	//Onde esperamos uma MutableList NÂO podemos passar uma List, pois a List é readonly
	//Não compila devido a restrição com mutableList, onde esperamos uma mutableList não podemos passar List
	//receiveMutable(listStr)
	
	val multStr:MutableList<String> = mutableListOf("java", "kotlin", "golang")
	
	receiveList(multStr)
	
	//Não compila, estamos esperando um MutableList<Any>, portanto não podemos passar um MutableList<String>,
	//Para funcionar poderia ser MutableList<out Any>, MutableList<*> ou MutableList<T> onde T é <T : Any>
	//receiveMutable(multStr)
}