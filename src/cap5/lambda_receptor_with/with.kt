package cap5.lambda_receptor_with

import java.lang.StringBuilder

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