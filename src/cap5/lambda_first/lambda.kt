package cap5.lambda_first

data class Person(val name:String, val age:Int)

fun maxAgeByManual(people:List<Person>):Person?{
	
	var currentPerson:Person? = null
	
	for(person in people){
	
		if(currentPerson == null || person.age > currentPerson.age)
			currentPerson = person
	}
	
	return currentPerson;
}

fun main(args: Array<String>) {
	
	val list = listOf(Person("Caio", 12), Person("Fernanda", 70), Person("Claudio", 5), Person("Maria", 30))
	
	val personManual = maxAgeByManual(list)
	
	println(personManual)
	
	val personLambda = list.maxBy { it.age }
	
	println(personLambda)
	
	val personLambdaReference = list.maxBy(Person::age)
	
	println(personLambdaReference)
}