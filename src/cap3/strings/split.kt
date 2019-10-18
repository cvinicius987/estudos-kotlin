package cap3.strings

fun main(args: Array<String>) {
	
	val address = "Rua Kotlin, numero: 120"
	
	val arr = address.split(",", ":")
	
	print(arr)
}