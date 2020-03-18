package cap5.scoping_functions_receptors

import java.lang.StringBuilder
import java.io.StringReader

/*
 * Utilizado como o try-resources do java, onde n�o temos que fechar recursos de forma implicita.
 */
fun main(args: Array<String>) {
	
	StringReader("teste").use {
		
		println(it.readLines())
	}
}