package cap4.companion_objects

class Computer(val name:String, val year:Int){
	
	companion object{}
}

fun Computer.Companion.welcomeMessage():String{
	
	return "Hello, Welcome to Kotlin code"
}

fun main(args: Array<String>) {
	
	var message = Computer.welcomeMessage()
	
	print(message)
}