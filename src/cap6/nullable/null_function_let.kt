package cap6.nullable

fun getSo() = "Windows"

fun getMemory():String? = null

fun getStr() = "Computador"

fun main(args: Array<String>) {
	
	//simples
	getSo().let { println(it) }
	
	getSo().let { result ->  println(result) }
	
	//em objeto null
	getMemory()?.let { result ->  println(result) }
	
	//com transformação de resultado
	val result = getStr().let { it.toUpperCase() }
	
	println(result)
}