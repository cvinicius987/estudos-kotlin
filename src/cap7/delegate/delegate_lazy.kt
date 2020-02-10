package cap7.delegate

fun loadEmails(person:PersonContract):List<String>{
	 
	println("Load Emails para: ${person.name}")
	
	return listOf("email1", "email2", "email3")
}

interface PersonContract{
	
	val name:String
	
	val emails:List<String>
}

//Sem Utilizar Delegate, implementação na mão
class Person(override val name:String) : PersonContract{
	
	private var _emails:List<String>? = null
	
	override val emails:List<String>
	get(){
		
		if(_emails == null){
			
			_emails = loadEmails(this)
		}
		
		return _emails!!
	}
}

//Utilizando Delegate
class PersonDelegate(override val name:String) : PersonContract{
	
	override val emails by lazy {
		
		loadEmails(this)
	}
}

fun main(args: Array<String>) {
	
	val p = Person("Caio")
	
	println(p.emails)
	
	println(p.emails)
	
	println(" ======================================== ")
	
	val p2 = PersonDelegate("Caio")
	
	println(p2.emails)
	
	println(p2.emails)
}