package cap10.reflection

import kotlin.reflect.KClass

data class TesteProperties(val name:String, val age:Int)

fun main(args: Array<String>) {
	
	val c = TesteProperties("Caio", 33)
	
	val clazz:KClass<TesteProperties> = c.javaClass.kotlin
	
	//val properties = clazz.memberProperties
}