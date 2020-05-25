package cap4.selead_class

import java.lang.IllegalArgumentException

sealed class Shape{}

class Circle(val name:String) : Shape()

class Triangle(val dimension:Int) : Shape()

fun test(s:Shape) = when(s){
	is Circle 	-> println(s.name)
	is Triangle -> println(s.dimension)
}

fun main(args: Array<String>) {
	
	test(Circle("Nome do circulo"))
	
	test(Triangle(10))
}