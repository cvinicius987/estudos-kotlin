package cap11.dsl.extension_type_receptor

fun main(args: Array<String>) {
	
	//Declara��o de um fun��o de extens�o baseada em fun��o
	val appendClx:StringBuilder.() -> Unit = {this.append("!")}
	
	val stringBuilder = StringBuilder("Hi")
	
	stringBuilder.appendClx()
	
	println(stringBuilder)
	
	println(buildString(appendClx))
}