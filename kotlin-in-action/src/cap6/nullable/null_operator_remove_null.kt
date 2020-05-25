package cap6.nullable

fun main(args: Array<String>) {
	
	val str:String? = null
	
	println(str?.toUpperCase())
	
	println(str!!.toUpperCase())
}