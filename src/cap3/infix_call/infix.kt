package cap3.infix_call

class Language(val name:String)

infix fun Language.completeName(type:String) = "A Linguagem ${this.name} é do tipo $type"
		
fun main(args: Array<String>) {
	
	//Chamada infixa (to)
	val map = mapOf(1 to "one", 2 to "two")
	
	for ((key, value) in map){
		println("Key: $key - Value: $value")
	}
	
	println("\n ========================== \n")
	
	val lan1 = Language("Java")
	
	println(lan1.completeName("OOP"));
	
	val lan2 = Language("Kotlin")
	
	//Chamada infixa
	println(lan2 completeName "OOP & Funcional");
}