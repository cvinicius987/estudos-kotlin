package cap5.lambda_collec_methods

import cap5.lambda_first.Person

fun main(args: Array<String>) {
	
	val people = listOf(Person("Caio", 32), Person("Fernanda", 36), Person("Joao", 15))
	
	//Verifica se existe pessoa menor de 18 anos
	println(people.any { it.age <= 18 })
	
	//Qualquer pessoa menor de 18 anos
	println(people.find { it.age <= 18 })
	
	//Todas as pessoas são maiores de idade
	println(people.all { it.age >= 21 })
	
	//Total de pessoas que são maiores de idade
	println(people.count { it.age >= 21 })
}