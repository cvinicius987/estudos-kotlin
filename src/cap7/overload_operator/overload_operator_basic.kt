package cap7.overload_operator

import cap7.*

operator fun Char.times(times:Int):String{
	
	return this.toString().repeat(times)
}

fun main(args: Array<String>) {
	
	val point1 = Point(10, 20)
	val point2 = Point(20, 40)
	
	//Sobrecarga do metodos plus +
	println(point1 + point2)
	
	//Sobrecarga do metodos minus -
	println(point1 - point2)
	
	//Sobrecarga do metodos times com paramentro diferente
	println(point1 * 10.0)
	
	//Sobrecarga com retorno diferente do tipo mandante
	println('a' * 10)
	
}