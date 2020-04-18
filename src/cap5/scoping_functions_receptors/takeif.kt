
data class Person(val name:String, val lastname:String, val age:Int)

fun main(args: Array<String>) {
	
	val person = Person("John", "Smith", 1)
	
	val p: Person? = person.takeIf { it.age >= 1 }
	
	val pNull: Person? = person.takeIf { it.age > 1 }
	 
	println(p)
	println(pNull) 
}