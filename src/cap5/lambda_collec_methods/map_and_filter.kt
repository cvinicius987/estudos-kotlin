package cap5.lambda_collec_methods

import cap5.lambda_first.Person

fun main(args: Array<String>) {
	
	//List
	val people = listOf(Person("Caio", 32), Person("Fernanda", 36), Person("Joao", 15))
	
	println(people.filter { p -> p.age >= 21 })
	
	println(people.filter { p -> p.age >= 21 }.map(Person::name))
	
	//Map
	val mapPerson = mapOf(Person("Caio", 32) to "Programador", Person("Fernanda", 36) to "Gerente", Person("Joao", 15) to "Estudante")
	
	println(mapPerson.filterKeys { it.age >= 21 }.mapValues { it.value.toUpperCase() })
}