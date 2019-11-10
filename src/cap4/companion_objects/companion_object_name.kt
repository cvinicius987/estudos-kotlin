package cap4.companion_objects

class Text{
	
	companion object Read{
		
		fun readFirdChar(str:String) = str.first()
	}
}

fun main(args: Array<String>) {
	
	val char = Text.Read.readFirdChar("Nome")
	
	println(char)
	
	val char2 = Text.readFirdChar("Kotlin")
	
	println(char2)
}