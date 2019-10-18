package cap3.local_function

class User(val name:String, val add:String)

fun saveUser(user:User) {
	
	fun validate(value:String, field:String){
		
		if(value.isEmpty()){
			throw IllegalArgumentException("User invalido, o campo $field esta vazio.")
		}
	}
	
	validate(user.name, "Name")
	validate(user.add, "Endereco")
}

fun main(args: Array<String>) {
	
	saveUser(User("Caio", ""))
}