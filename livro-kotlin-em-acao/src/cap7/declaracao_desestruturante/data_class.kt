package cap7.declaracao_desestruturante

import cap7.Point

fun main(args: Array<String>) {
	
	val point = Point(10, 20)
	
	val (x, y) = point
	
	println(x)
	
	println(y)
}