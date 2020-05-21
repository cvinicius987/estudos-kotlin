package cap11.dsl.extension_type_receptor

fun main(args: Array<String>) {
	
	//Função com lambda com parametro, trabalhamos com o parametro ow com o inferencia it
	val fnStr:(StringBuilder) -> Unit = {builder -> builder.append("Teste")
								      				println(builder.toString())}
	
	fnStr(StringBuilder())
	
	//Função com lambda com parametro receptor
	//dessa forma o acesso é feito através do this
	val fnStrReceptor:(StringBuilder.() -> Unit) = {append("Teste")
												    println(toString())}
	
	fnStrReceptor(StringBuilder())
}