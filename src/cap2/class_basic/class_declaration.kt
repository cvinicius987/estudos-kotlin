package cap2

class Person(val name:String, var isMarried:Boolean){
	
	//Cria o atributo customName e atribui uma logica ao metodo get()
	val customName:String
	get(){
		
		var marry = if (isMarried) "estado civil é casado" else "estado civil é solteiro"
		
		return "O nome é $name e o $marry"
	}
}

fun main(args: Array<String>) {

	val person = Person("Pedro", false)
	
	println(person.customName)
	
	val person2 = Person("Fernando", true)
	
	println(person2.customName)
}