package cap5.lambda_receptor_apply

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