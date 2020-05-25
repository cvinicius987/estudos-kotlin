package cap6.nullable

fun main(args: Array<String>) {
	
	val value:Double = 10.0
	
	println(value as Number)
	
	println(value as? String)
	
	println(value as String)
}