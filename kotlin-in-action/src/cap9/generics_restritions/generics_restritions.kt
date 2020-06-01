package cap9.generics_restritions

//Adiicionada a restrição onde temos que passar 2 parametros que sejam
// do tipo Comparable
fun <T : Comparable<T>> getFisrt(one:T, two:T):T{
	
	return if(one > two) one else two
}

fun processAny(one:Any){
	println(one)
}

fun <T : Any> processAnyExtend(one:T){
	println(one)
}

fun main(args: Array<String>) {
	
	println(getFisrt("Java", "Kotlin"))

    processAny("teste")

    processAnyExtend("teste")
}