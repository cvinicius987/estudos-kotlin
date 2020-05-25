package cap4.backing_field

class User(val name:String){

	var address:String ="NaN"
	set(value:String){
		
		println("Address change for $name: $field to $value".trimIndent())
		
		field = value;
	}
}

fun main(args: Array<String>) {
	
	val user = User("Caio")
	
	user.address = "Avenida"
}