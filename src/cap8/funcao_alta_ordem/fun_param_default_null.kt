
fun executeConsumer(consumer:(String) -> Unit = { println(it)}){
	
	val list = listOf("java", "Kotlin", "PHP", "Golang")
	
	list.forEach(consumer)
}

fun main(args: Array<String>) {
	
	executeConsumer()
	
	executeConsumer({ println(it.toUpperCase())})
}