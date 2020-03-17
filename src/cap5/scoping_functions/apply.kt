package cap5.scoping_functions

import java.lang.StringBuilder

fun numbers() = StringBuilder().apply {
	
	this.append("StringBuilder com apply\n")
	
	for(number in 0..20){
		append(number)
		append(" ")
	}
}

fun main(args: Array<String>) {
	
	println(numbers().toString())
}