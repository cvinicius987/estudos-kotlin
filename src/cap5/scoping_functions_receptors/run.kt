package cap5.scoping_functions_receptors

import java.lang.StringBuilder

fun main(args: Array<String>) {
	
	//Retorna qualquer valor a partir do objeto que iniciou, usando a referencia this
	val teste:Int = StringBuilder().run {
		
		append("1")
		append("2")
		append("3")
		
		val str = toString()
		
		str.toInt()
	}
	
	println(teste)
}