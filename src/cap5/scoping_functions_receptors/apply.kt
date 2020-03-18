package cap5.scoping_functions_receptors

import java.lang.StringBuilder

fun main(args: Array<String>) {
	
	//Retorna o proprio objeto utilizado, usando a referencia this
	val result = StringBuilder().apply {
		
		this.append("StringBuilder com apply\n")
		
		for(number in 0..20){
			append(number)
			append(" ")
		}
	}
	
	println(result.toString())
}