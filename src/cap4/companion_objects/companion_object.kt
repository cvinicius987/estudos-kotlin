package cap4.compain_objects

fun genericName(num:Int): String{
	
	return when(num){
		0 -> "Joao"
		1 -> "Augusto"
		2 -> "Fernando"
		else -> "Sem nome"
	}
}

class User private constructor (val name:String) {
	
	companion object{
		
		fun newUser(nameNew:String):User{
			return User(nameNew)
		}
		
		fun newUser(number:Int):User{
			return User(genericName(number))
		}
	}
}

fun main(args: Array<String>) {
	
	val user1 = User.newUser("Caio")
	
	println(user1.name)
	
	val user2 = User.newUser(1)
	
	println(user2.name)
	
	val user3 = User.newUser(10)
	
	println(user3.name)
}