package cap11.dsl.extension_type_receptor

fun main(args: Array<String>) {
	
	//Fun��o com lambda com parametro, trabalhamos com o parametro ow com o inferencia it
	val fnStr:(StringBuilder) -> Unit = {builder -> builder.append("Teste")
								      				println(builder.toString())}
	
	fnStr(StringBuilder())
	
	//Fun��o com lambda com parametro receptor
	//dessa forma o acesso � feito atrav�s do this
	val fnStrReceptor:(StringBuilder.() -> Unit) = {append("Teste")
												    println(toString())}
	
	fnStrReceptor(StringBuilder())
}