package cap7.delegate

class PersonMap(){
	
	private val map = hashMapOf<String, String>()
			
	fun setAttribute(att:String, value:String){
		
		map[att] = value
	}
	
	//Map com chamada delegate são interpoladas onde a key do map seja o nome da propriedade no caso [name]
	val name:String by map
}

fun main(args: Array<String>) {
	
	val person = PersonMap();
	
	val mapTeste = hashMapOf("name" to "Oracle", "Kotlin" to "JetBrains")
	
	for((key, value) in mapTeste)
		person.setAttribute(key, value)
	
	println(person.name)
}