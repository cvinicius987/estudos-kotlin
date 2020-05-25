package cap6.collection_readonly

fun main(args: Array<String>) {
	
	//Cria��o de uma lista Readonly
	val listReadonly:Collection<Int> = arrayListOf(1,2,3,4,5,6,7,8,9,10)
	
	println(listReadonly)
	
	//Cria��o de uma lista Mutable, apontado para o mesmo endere�o de memoria da lista Readonly
	val listWWrite:MutableCollection<Int> = listReadonly as MutableCollection
	
	listWWrite.add(14)
	
	println(listReadonly)
}