package cap9.variance_type

import java.lang.NullPointerException

fun <T> printAllInvariance(list:List<T>):T{
	
	if(list.isNotEmpty())
		return list.first()
	
	throw NullPointerException("Lista vazia")
}

/*
 * <Any?> - Lista do maior tipo de kotlin, onde a lista pode ser composta de varios objetos não havendo restição de um unico tipo
 */
fun printAllNull(list:List<Any?>):Any?{
	
	if(list.isNotEmpty())
		return list.first()
	
	throw NullPointerException("Lista vazia")
}

/*
 * <*> - Significa que a List pode receber qualquer objeto, mas nela terá somente um Tipo, ou seja
         isso a torna diferente de uma List<Any?>, onde podemos ter uma List de diferentes objetos.
 *		 É util quando você não se importa com os valores dentro da Coleção, e só tem interesse em exibir ou ler
 */
fun printAll(list:List<*>):Any?{
	
	if(list.isNotEmpty())
		return list.first()
	
	throw NullPointerException("Lista vazia")
}

fun main(args: Array<String>) {
	
	val listAggregate = listOf<Any?>("Str", 1, 1.0, 'c', true, null)
	
	val listTyped = listOf<Number>(1, 1.0, 2.0F)
	
	val list = listOf<String>("Str1", "Str2", "Str3")
	
	//printAllInvariance
	println(printAllInvariance(listAggregate))
	println(printAllInvariance(listTyped))
	println(printAllInvariance(list))
	
	//printAllNull
	println(printAllNull(listAggregate))
	println(printAllNull(listTyped))
	println(printAllNull(list))
		
	//printAllNull
	println(printAll(listAggregate))
	println(printAll(listTyped))
	println(printAll(list))
}