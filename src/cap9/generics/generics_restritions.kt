package cap9.generics

import java.lang.Appendable

//Adiicionada a restrição onde temos que passar 2 parametros que sejam
// do tipo Comparable
fun <T : Comparable<T>> getFisrt(one:T, two:T):T{
	
	return if(one > two) one else two
}

fun main(args: Array<String>) {
	
	println(getFisrt("Java", "Kotlin"))
}