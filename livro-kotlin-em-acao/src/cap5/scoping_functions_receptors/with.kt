package cap5.scoping_functions_receptors

import java.lang.StringBuilder

/**
 * With
 *
 * Passa o objeto e usa this para acessar suas propriedades
 */
fun with():String{
		
	//Retorna qualquer valor a partir do objeto que iniciou, usando a referencia this
	return with(StringBuilder()){
		
		append("Lista de numeros: \n")
		
		for(number in 0..20){
			this.append(number)
			this.append(" ")
		}
		
		toString()
	}
}

fun main(args: Array<String>) {
	
	println(with())
}