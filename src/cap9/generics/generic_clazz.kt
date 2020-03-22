package cap9.generics

interface DataManipulate<T>{
	
	fun getValue():T
}
	
class IntDataManipulate(private val value:Int) : DataManipulate<Int>{
	
	override fun getValue() = value
}

fun main(args: Array<String>) {
	
	val intDataManipulate = IntDataManipulate(10)
	
	println(intDataManipulate.getValue())
}