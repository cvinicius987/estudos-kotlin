package cap5.lambda

import cap5.lambda_first.Person

fun nameProgram() = println("Kotlin lambda example....")

fun sendEmail(p:Person, message:String) = println("Email de $p com a mensagem $message ")

fun Person.isAdult() = age >= 21

fun main(args: Array<String>) {
	
	//================================================= 1
	val person = Person("Caio", 32)

	val getAgeLambda 	= {p:Person -> p.age}
	val getAge 			= Person::age
	
	println(getAgeLambda(person))
	println(getAge(person))
	
	//================================================= 2
	run({ nameProgram() })
	run(::nameProgram)
	
	//================================================= 3
	val action 	  = {p:Person, message:String -> sendEmail(p, message)}
	
	val newAction = ::sendEmail
	
	action(person, "Email....")
	newAction(person, "Email....")
	
	//================================================= 4
	val newPerson 	  = ::Person
	val createdPerson = newPerson("Joao", 40)
	
	println(createdPerson)
	
	//================================================= 5
	val adultPredicate = Person::isAdult
	
	println(adultPredicate(createdPerson))
	
	println(adultPredicate(newPerson("Fernanda", 15)))
	
	//=================================================  6 -- A partir do kotlin 1.1
	val person11 = Person("Claudia", 50)
	
	val agePred = Person::age
	
	println(agePred(person11))
	
	run({ println(agePred(person11)) })
	
	val personVinculada = Person("Claudia", 50)
	
	val agePredVinc = personVinculada::age
	
	println(agePredVinc())
	
	run({ println(agePredVinc()) })
}