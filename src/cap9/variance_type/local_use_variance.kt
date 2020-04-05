package cap9.variance_type

/**
 * MutableList<out T> -> aqui � permitido passar um parametro que seja um T ou seja um subtipo de T (posi��o out)
 * MutableList<in T>  -> aqui � permitido passar um parametro que seja um T ou seja um supertipo de T (posi��o in)
 */
fun <T> copyList(read:MutableList<out T>, write:MutableList<in T>):Unit{
	
	read.forEach { write.add(it) }
}

fun main(args: Array<String>) {
	
	val list = mutableListOf(1, 2, 3, 4, 5)
	
	val result = mutableListOf<Any>()
	
	copyList(list, result)
	
	println(result)
}