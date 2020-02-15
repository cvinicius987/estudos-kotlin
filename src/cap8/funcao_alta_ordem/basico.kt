package cap8.funcao_alta_ordem

/**
 * Função de alta ordem, são funcões que recebem uma função como argumento,
 * ou devolve um função como resultado.
 */
fun calculate(x:Int, y:Int, operation:(Int, Int) -> Int):Int{
	
	return operation(x, y)
}

fun main(args: Array<String>) {

	val x = 10
	val y = 20
	
	println(calculate(x, y, {x1, y1 -> x1 + y1}))
	println(calculate(x, y, {x1, y1 -> x1 - y1}))
	println(calculate(x, y, {x1, y1 -> x1 * y1}))
	println(calculate(x, y, {x1, y1 -> x1 / y1}))
}