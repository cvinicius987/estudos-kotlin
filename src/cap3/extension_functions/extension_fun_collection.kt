package cap3.extension_functions

import cap3.functions.joinToString as join

fun <T> Collection<T>.joinToString(init:String=" | ",
								   del:String=", ",
								   last:String=" | ") = join(this, init, del, last)

fun main(args: Array<String>) {
	
	val list = setOf(1, 2, 3, 4, 5)
	
	println(list.joinToString())
}