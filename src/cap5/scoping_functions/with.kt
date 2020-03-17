package cap5.scoping_functions

import java.lang.StringBuilder

/**
 * With
 *
 * Passa o objeto e usa this para acessar suas propriedades
 */
fun numbers():String{
	
	val stringBuilder = StringBuilder()
	
	return with(stringBuilder){
		
		append("Lista de numeros: \n")
		
		for(number in 0..20){
			this.append(number)
			this.append(" ")
		}
		
		toString()
	}
}

fun numbersSimple() = with(StringBuilder()){
		
	append("Lista de numeros: \n")
	
	for(number in 0..20){
		this.append(number)
		this.append(" ")
	}
	
	toString()
}


fun main(args: Array<String>) {
	
	println(numbers())
	println(numbersSimple())
}