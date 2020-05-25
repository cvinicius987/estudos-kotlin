package cap5.scoping_functions_receptors

import java.lang.StringBuilder

fun main(args: Array<String>) {
	
	//Retorna o proprio objeto do qual partiu o escopo, usando a referencia it
	val teste = StringBuilder().also {
		
		it.append("teste")
		it.append("|")
		it.append("teste")
	}
	
	println(teste.toString())
}