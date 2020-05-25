package cap6.arrays

fun main(args: Array<String>) {
	
	//Array de Objetos
	val arrStr:Array<String> = arrayOf("Nome")
	
	println(arrStr.joinToString())
	
	//Array de Wrappers
	val arrInt:Array<Int> = arrayOf(1,2,3,4,5,6)
	
	println(arrInt.joinToString())
	
	//Array de primitivos
	val arrIntPrimitivos:IntArray = intArrayOf(1,2,3,4,5,6)
	
	println(arrIntPrimitivos.joinToString())
	
	//Criando um Array com iniciialização pelo construtor
	val arrLambda:Array<String> = Array(26) {it -> ('A' + it).toString()}
	
	println(arrLambda.joinToString())
}