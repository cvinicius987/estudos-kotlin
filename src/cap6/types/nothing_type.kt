package cap6.types

import java.lang.IllegalArgumentException

fun fail(msg:String):Nothing{
	throw IllegalArgumentException(msg)
}

fun main(args: Array<String>) {
	
	val str:String? = null
	
	println(str ?: fail("String esta nula...."))
}