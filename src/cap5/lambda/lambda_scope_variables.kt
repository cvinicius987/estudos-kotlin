package cap5.lambda

import cap5.lambda_first.Person

fun countLetters(list:List<Person>, logic:(Person) -> Boolean):Int{
	
	var count = 0
	
	list.filter(logic)
		.forEach({ count++ })
	
	return count
}

fun main(args: Array<String>) {
	
	val list = listOf(Person("Caio", 12), Person("Fernanda", 70), Person("Claudio", 5), Person("Maria", 30))
	
	println(countLetters(list, { it.name.startsWith("C") }))
	
	println(countLetters(list, { it.name.startsWith("F") }))
	
	println(countLetters(list, { it.name.startsWith("M") }))
}