package cap5.lambda_first

fun letterC(list:List<Person>, logic:(Person) -> Boolean){
	
	list.filter(logic)
		.forEach({ println(it.name) })
}

val sendMessage = {p:Person, message:String -> println("$p esta enviado a mensagem: $message ")}
	
fun main(args: Array<String>) {
	
	val list = listOf(Person("Caio", 12), Person("Fernanda", 70), Person("Claudio", 5), Person("Maria", 30))
	
	//Lambda como parametro de fun��o
	val names = list.joinToString(separator = " ", transform = { p: Person -> p.name })
		
    println(names)
	
	//Passando um Lambda para um metodo
	letterC(list, {p:Person -> p.name.startsWith("C")})
	
	//Executando uma fun��o lambda
	sendMessage(Person("Caio", 12), "Email....")
}