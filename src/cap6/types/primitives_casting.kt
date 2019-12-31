package cap6.primitives_wrappers

fun main(args: Array<String>) {
	
	val intValue:Int = 1
	
	//Kotlin não possui conversão automatica de tipos, mesmo que seja de tipos menores para maiores
	//É necessário a chamada explicita do metodo de conversão
	val longValue:Long 		= intValue.toLong()
	val shortValue:Short	= intValue.toShort()
	val byteValue:Byte 		= intValue.toByte()
	
	println(longValue)
	println(shortValue)
	println(byteValue)
}