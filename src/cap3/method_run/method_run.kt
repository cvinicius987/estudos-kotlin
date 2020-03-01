package cap3.method_run

import java.lang.StringBuilder

fun main(args: Array<String>) {

	val builder = StringBuilder()
	
	//Retorna qualquer valor a partir do obejto que iniciou e trata como this
	val teste = builder.run {
		
		append("1")
		append("2")
		append("3")
		
		val str = toString()
		
		str.toInt()
	}
	
	
	println(teste)
}