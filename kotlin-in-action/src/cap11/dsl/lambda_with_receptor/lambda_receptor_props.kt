package cap11.dsl.extension_type_receptor

fun main(args: Array<String>) {
	
	//Declaração de um função de extensão baseada em função
	val appendClx:StringBuilder.() -> Unit = {this.append("!")}
	
	val stringBuilder = StringBuilder("Hi")
	
	stringBuilder.appendClx()
	
	println(stringBuilder)
	
	println(buildString(appendClx))
}