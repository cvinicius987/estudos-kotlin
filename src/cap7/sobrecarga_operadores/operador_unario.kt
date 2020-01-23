package cap7.sobrecarga_operadores

import cap7.Point

operator fun Point.inc():Point{
	
	return Point(this.one + 1 , this.two + 1)
}

fun main(args: Array<String>) {
	
	var point = Point(10, 20)
	
	println(point++)
	println(++point)
}