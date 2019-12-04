package cap6.nullable

class Address(val street:String, val num:Int)

class Company(val name:String, val address:Address?)

class Person(val name:String, val company:Company?=null)

fun printAll(person:Person):Unit{
	
	//teste com Elvis operator ?:
	val address = person.company?.address ?: throw IllegalArgumentException("Endereço inválido.")
	
	with(address){
		
		println(street)
		println("$street $num")
	}
}

fun main(args: Array<String>) {
	
	val address = Address("Avenida", 100)
	
	val company = Company("Google", address)
	
	val person = Person("Caio", company)
	
	val personNull = Person("Caio")
	
	printAll(person)
	
	printAll(personNull)
}