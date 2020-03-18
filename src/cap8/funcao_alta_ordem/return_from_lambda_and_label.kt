package cap8.funcao_alta_ordem

fun returnFromLambda(list:List<String>){
	
	//ForEach � uma fun��o inline, por isso podemos usar non-local return
	//dessa forma o metodo � retornado n�o somente o bloco
	list.forEach {
		
		if(it == "C"){
			
			println("Achei....")
			return
		}
	}
	
	println("N�o Achei....")
}

fun returnFromLambdaLabel(list:List<String>){
	
	//Utilizando labels para o return, aqui o return � local, ou seja ser� retorna na lambda e o restante
	//do metodo ser� executado
	list.forEach label@ {
		
		if(it == "C"){
			
			println("Label: Achei....")
			return@label
		}
	}
	
	println("Label: terminei o processo")
}

fun main(args: Array<String>) {
	
	val list = listOf("A", "B", "C")
	
	returnFromLambda(list)
	
	returnFromLambdaLabel(list)	
}