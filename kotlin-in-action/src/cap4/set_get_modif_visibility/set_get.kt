package cap4.set_get_modif_visibility

class Length{
	
	var total:Int=0
	private set
	
	fun addString(str:String){
		total += str.length
	}
}

fun main(args: Array<String>) {

	val len = Length()
	
	println(len.total)
	len.addString("SP")
	println(len.total)
	len.addString("Kotlin")
	println(len.total)
	len.addString("Java")
	println(len.total)
}