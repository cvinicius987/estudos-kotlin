
enum class Type{
	
	UPPERCASE, LOWERCASE;
}

fun defineMap(type:Type):(String) -> String{
	
	return when(type){
		Type.UPPERCASE -> {str -> str.toUpperCase()}
		else -> {str -> str.toLowerCase()}
	}
}

fun main(args: Array<String>) {
		
	val list = listOf("Java", "Kotlin", "PHP", "Golang")
	
	list.map(defineMap(Type.UPPERCASE)).forEach({ println(it) })
	
	list.map(defineMap(Type.LOWERCASE)).forEach({ println(it) })
}