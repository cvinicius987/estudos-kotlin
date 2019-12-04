package cap6.nullable

fun size(str:String?):Int?{
	
	return str?.length
}

fun main(args: Array<String>) {
	
	val str = "teste"
	
	println(size(str))
	println(size(null))
}
