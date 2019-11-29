package cap5.lambda_method_buildString

fun chars() = buildString {
	
	append(" Criando String a partir de buildString \n")
	
	for(char in 'A'..'Z'){
		append(char)
		append(" ")
	}
}

fun main(args: Array<String>) {
	
	println(chars())
}