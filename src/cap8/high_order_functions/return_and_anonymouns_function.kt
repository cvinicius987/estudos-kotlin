package cap8.funcao_alta_ordem


//Quando utilizamos fun��es anonimas ao inv�s de lambdas
//sempre a fun��o que ser� retornada � a mais proxima,
//no caso ser� a fun anonima
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