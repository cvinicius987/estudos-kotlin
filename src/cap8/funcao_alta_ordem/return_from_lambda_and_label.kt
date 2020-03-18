package cap8.funcao_alta_ordem

fun returnFromLambda(list:List<String>){
	
	//ForEach é uma função inline, por isso podemos usar non-local return
	//dessa forma o metodo é retornado não somente o bloco
	list.forEach {
		
		if(it == "C"){
			
			println("Achei....")
			return
		}
	}
	
	println("Não Achei....")
}

fun returnFromLambdaLabel(list:List<String>){
	
	//Utilizando labels para o return, aqui o return é local, ou seja será retorna na lambda e o restante
	//do metodo será executado
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