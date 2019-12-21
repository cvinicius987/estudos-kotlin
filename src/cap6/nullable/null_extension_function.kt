package cap6.nullable

fun String?.getNameCanBeNull() = if(this != null) this.toUpperCase() else " "

fun String.getName() = this.toUpperCase()

fun main(args: Array<String>) {
	
	//Nullable
	val strNull:String? = null
	
	println(strNull.getNameCanBeNull())
	println(strNull?.getName())
	
	//Not null
	val str:String = "Kotlin"
	
	println(str.getNameCanBeNull())
	println(str.getName())
}