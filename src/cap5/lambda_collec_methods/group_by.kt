package cap5.lambda_collec_methods

import cap5.lambda_first.Person

fun main(args: Array<String>) {
	
	val people = listOf(Person("Caio", 32), Person("Fernanda", 32), Person("Joao", 15))
	
	println(people.groupBy { it.age })
	
	val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
	
	val result = numbers.groupBy({key -> if(key % 2 == 0) "PAR" else "IMPAR" })
	
	println(result)
}