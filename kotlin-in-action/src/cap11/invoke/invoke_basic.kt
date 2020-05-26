package cap11.invoke

class User(val name:String){
	
	operator fun invoke(age:Int){
		
		println("O Usuario $name, tem $age de idade.")
	}
}

fun main(args: Array<String>) {
	
	val user = User("Caio")
	
	user(33)
}