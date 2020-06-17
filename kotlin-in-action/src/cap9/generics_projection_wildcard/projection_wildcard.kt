package cap9.variance_type

import java.util.Random

fun main(args: Array<String>) {
	
	val mutableList:MutableList<Any?> = mutableListOf('a', 1, null, "Str")
	
	val chars:MutableList<Char> = mutableListOf('a', 'b', 'c')
	
	//Uma coleção marcada com <*>,
	// significa que somente queremos ler os dados sem que o tipo seja importante
	val elements:MutableList<*> = if (Random().nextBoolean()) mutableList else chars
	
	//Não é posisvel adicionar valores em colção com <*>, elas são somente leituras independente de serem MutableList
	//elements.add("")
	
	println(elements)
}