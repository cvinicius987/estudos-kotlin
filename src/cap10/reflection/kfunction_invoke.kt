package cap10.reflection

fun sum(x:Int, y:Int)=x+y

fun main(args: Array<String>) {
	
	//Auqi podemos chamar o metodo invoke da interface kfunction assim conseguimos
	//chamar o metodo exatamente como na assinatura do original e com analise
	//em tempo de compilação
	val kFunction = ::sum
	
	println(kFunction.invoke(10, 20))
}