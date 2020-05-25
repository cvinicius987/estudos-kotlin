package cap10.annotation

fun main(args: Array<String>) {
	
	val list:List<*> = listOf<Any>("", 1, 'c')
	
	@Suppress("UNCHECKED_LIST")
	val listResult = list as List<String>
	
	println(list)
}