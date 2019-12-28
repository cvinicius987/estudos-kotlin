package cap6.primitives_wrappers

//No caso de Int?, este será compilado para Wrapper, pois primitivos em Java não podem receber nulls
data class Person(val name:String, val age:Int? = null){
	
	fun ageBiggerThanOther(other:Person):Boolean?{
		
		if(age == null || other.age == null)
			return null
		
		return age > other.age
	}
}

fun main(args: Array<String>) {
	
	val person  = Person("Caio", 32)
	val person2 = Person("Caroline", 18)
	val person3 = Person("Claudia")
	
	println(person.ageBiggerThanOther(person2))
	println(person.ageBiggerThanOther(person3))
	println(person2.ageBiggerThanOther(person))
	println(person2.ageBiggerThanOther(person3))
	println(person3.ageBiggerThanOther(person))
	println(person3.ageBiggerThanOther(person2))
}