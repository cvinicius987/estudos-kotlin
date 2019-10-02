package classes

class Person(val name:String, var isMarried:Boolean){
	
	val customName:String
	get(){
		
		var marry = if (isMarried) "estado civil � casado" else "estado civil � solteiro"
		
		return "O nome � $name e o $marry"
	}
}

fun main(args: Array<String>) {

	val person = Person("Pedro", false)
	
	println(person.customName)
	
	val person2 = Person("Fernando", true)
	
	println(person2.customName)
}