package cap3.method_also

import java.lang.StringBuilder

fun main(args: Array<String>) {

	val builder = StringBuilder()
	
	//Retorna o proprio objeto do qual partiu o escopo
	val teste = builder.also {
		
		it.append("teste")
		it.append("|")
		it.append("teste")
	}
	
	
	println(teste.toString())
}