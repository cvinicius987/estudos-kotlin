package cap6.types

fun main(args: Array<String>) {
	
	val num:Any = 10
	
	val text:Any = "Kotlin"
	
	val textNull:Any? = null
	
	println(num is Int)
	println(text is String)
	
	println(textNull is Any)
}