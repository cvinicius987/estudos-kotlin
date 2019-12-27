package cap6.null_platform_type

import cap6.null_platform_type.Pessoa

fun printName(p:Pessoa){
	
	println("Seu name �: ${p.name.toUpperCase()}")
}

fun main(args: Array<String>) {
	
	//Atribui��o
	val pessoa = Pessoa("Caio")
	
	val name:String 	 = pessoa.name
	val nameNull:String? = pessoa.name
	
	println("$name - $nameNull")
	
	//Chamada de Metodos
	printName(Pessoa("Caio"))
	
	//Acontece Exce��o
	printName(Pessoa(null))
}