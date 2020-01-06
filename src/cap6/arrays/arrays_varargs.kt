package cap6.arrays

fun showStrVararg(vararg arr:String){
	
	println(arr.joinToString().toUpperCase())
}

fun main(args: Array<String>) {
	
	//Uso de Arrays com varargs
	val arr:Array<String> = arrayOf("Java", "Kotlin", "C", "PHP", "Go")
	
	showStrVararg(*arr)
	
	showStrVararg("Ruby", "C++")
	
	showStrVararg("Ruby", "C++", *arr)
}