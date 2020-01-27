package cap7.sobrecarga_operadores_convencoes

import cap7.Point

data class Retangulo(val p:Point, val p2:Point){
	
	operator fun contains(find:Point):Boolean{
		
		return find.x in p.x until p2.x &&
			   find.y in p.y until p2.y
	}
}

fun main(args: Array<String>) {
	
	val p  = Point(10, 20)
	val p2 = Point(15, 30)
	
	val r = Retangulo(p, p2)
	
	//Uso do operador in
	println(Point(11, 19) in r)
	
	//Uso da chamada explicita do metodo contains
	println(r.contains(Point(11, 19)))
}