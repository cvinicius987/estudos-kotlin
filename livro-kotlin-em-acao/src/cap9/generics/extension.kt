package cap9.generics

//Extension method
fun <T> List<T>.inverseOf():List<T>{
	
	return this.asReversed()
}

//Extension props
val <T> List<T>.penultimate:T
	get() = this[size - 2]

fun main(args: Array<String>) {
	
	println(listOf(1, 2, 3, 4, 5).penultimate)
	
	println(listOf(1, 2, 3, 4, 5).inverseOf())
}