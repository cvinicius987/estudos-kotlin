package cap9.variance_type

import java.time.LocalDateTime
import java.time.temporal.Temporal

/**
 * Aqui marcamos para receber um MutableList<in Temporal>, ou seja, é permitido passar uma mutableList de Temporal ou um supertipo de Temporal
 */
fun addTime(list:MutableList<in Temporal>){
	
	list.add(LocalDateTime.now())
}	

fun main(args: Array<String>) {
	
	//Criação uma lista de temporal
	val list = mutableListOf<Temporal>(LocalDateTime.now(), LocalDateTime.of(10, 10, 10, 23, 45, 8))
	
	addTime(list)
	
	println(list)
}