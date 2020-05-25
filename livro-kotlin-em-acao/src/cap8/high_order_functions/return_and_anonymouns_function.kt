package cap8.funcao_alta_ordem


//Quando utilizamos funções anonimas ao invés de lambdas
//sempre a função que será retornada é a mais proxima,
//no caso será a fun anonima
fun viewName(list:List<String>):Unit{
	
	list.forEach(fun(c){
		if( c == "Alice"){
			println(c)
			return
		} 
	})
	
	println("Chegou......")
}

fun main(args: Array<String>) {
	
	viewName(listOf("Fernanda", "Alice", "Pedro", "Caio"))
}