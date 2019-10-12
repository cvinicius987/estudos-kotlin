package cap3.extension_functions.use

import cap3.extension_functions.lastChar as last
import cap3.extension_functions.joinToString

fun main(args: Array<String>) {
	
	println("Nome".last())
	
	val list = setOf(1, 2, 3, 4, 5)
	
	println(list.joinToString())
}