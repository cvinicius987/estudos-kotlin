package cap7.overload_operator

import cap7.Point

fun main(args: Array<String>) {
	
	var point = Point(10, 20)
	
	val point2 = Point(10, 20)
	
	//Chamada do operador composto
	point += point2
	
	println(point)
	
	//Ao declarar como var é possivel alterar a instancia de Point
	println(point + point2)
}