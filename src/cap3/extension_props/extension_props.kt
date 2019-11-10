package cap3.extension_functions

//Extension Props VAR
var StringBuilder.lastChar: Char
	get():Char{
		return this.get(length - 1)
	}
	set(valor:Char){
		this.setCharAt(length - 1, valor)
	}

//Extension Props VAL
val String.welcome: String
	get() = "Bem-vindo a String em Kotlin"
	
fun main(args: Array<String>) {
	
	val str =  "Kotlin"
	
	println(str.welcome)
	
	val sb = StringBuilder(str)
	
	sb.lastChar = '!'
	
	println(sb)
}