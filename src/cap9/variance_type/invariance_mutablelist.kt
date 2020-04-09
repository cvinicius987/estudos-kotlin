package cap9.variance

//Nesse caso o compilador permite devido a Ao tipo ser Any, e a List ser imutavel e readonly
//Portanto podemos passar uma MutableList
fun receiveList(list:List<Any>){
	
	println(list.joinToString())	
}

//Nesse caso o compilador N�O permite devido a MutableList
//List � readonly portanto n�o podemos passar List
fun receiveMutable(list:MutableList<Any>){
	
	println(list.joinToString())
}

fun main(args: Array<String>) {
	
	/*
     * Onde esperamos uma List podemos passar uma MutableList, pois esta herda List e apenas n�o ser� utilizado os metodos de escrita
     * A regra de genrics aqui � valida, pois mesmo esperando um List<Any> podemos passar uma List<String>,
     *
     * Aqui isso � valido porque List � readonly e n�o corre risco de adi��o de dados fora da hirerquia correta
     */
	val listStr:List<String> = listOf("java", "kotlin", "golang")
	
	receiveList(listStr)
	
	//Onde esperamos uma MutableList N�O podemos passar uma List, pois a List � readonly
	//N�o compila devido a restri��o com mutableList, onde esperamos uma mutableList n�o podemos passar List
	//receiveMutable(listStr)
	
	val multStr:MutableList<String> = mutableListOf("java", "kotlin", "golang")
	
	receiveList(multStr)
	
	//N�o compila, estamos esperando um MutableList<Any>, portanto n�o podemos passar um MutableList<String>,
	//Para funcionar poderia ser MutableList<out Any>, MutableList<*> ou MutableList<T> onde T � <T : Any>
	//receiveMutable(multStr)
}