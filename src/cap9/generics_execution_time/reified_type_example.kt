package cap9.reified_type

//Verifica se objeto Any é o tipo passado em T
//o codigo da função inline é adicionado diretamente onde a função for chamada
//devido ao reified o tipo T é substituido pelo valor passado ao generic da função
inline fun <reified T> isType(value:Any):Unit{
	
	println(value is T)
} 

inline fun <reified T> contentIs(value:List<Any>):List<T>{
	
	return value.filterIsInstance<T>()
}

fun main(args: Array<String>) {
	
	isType<Number>(1)
	isType<Number>("teste")
	isType<Double>(1)
	isType<Float>(1.0F)
	
	println(" ========================================== ")
	
	println(contentIs<String>(listOf("teste", 1, "teste2")))
	println(contentIs<Number>(listOf("teste", 1, "teste2")))
}