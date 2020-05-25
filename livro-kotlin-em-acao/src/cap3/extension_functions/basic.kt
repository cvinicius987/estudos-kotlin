package cap3.extension_functions

fun String.lastChar() : Char = get(length - 1)

fun main(args: Array<String>) {
	
	var str = "Nome"
	
	println(str.lastChar())
}