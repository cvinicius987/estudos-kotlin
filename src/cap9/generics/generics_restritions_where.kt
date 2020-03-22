package cap9.generics

import java.lang.Appendable

//Exemplo onde temos 2 ou mais restrições para um mesmo tipo
//usado a palavra where
fun <T> putLastPoint(value:T):String  where T : CharSequence, T : Appendable{
	
	if(!value.endsWith(".")){
		value.append(".")
	}
	
	return value.toString()
}

fun main(args: Array<String>) {
	
	println(putLastPoint(StringBuilder("Java é a linguagem mais utilizada no mundo.")))
	
	println(putLastPoint(StringBuilder("Kolitn linguagem simples que tem futuro promissor")))
}