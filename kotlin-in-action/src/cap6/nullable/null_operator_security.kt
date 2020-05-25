package cap6.nullable

fun main(args: Array<String>) {
	
	val address = Address("Avenida", 100)
	
	val company = Company("Google", address)
	
	val person = Person("Caio", company)
	
	val person2 = Person("Caio", null)
	
	println(person.company?.address)
	
	println(person2.company?.address)
}