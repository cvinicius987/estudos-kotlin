package cap7.sobrecarga_operadores

import cap7.Point

fun main(args: Array<String>) {
	
	val point  = Point(2, 4)
	val point2 = Point(10, 20)
	
	println(point > point2)
	println(point < point2)
}