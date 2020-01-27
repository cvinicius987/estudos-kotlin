package cap7.sobrecarga_colecoes_intervalos

import cap7.Point
import java.lang.IndexOutOfBoundsException

operator fun Point.get(index:Int):Int{
	
	return when(index){
		0 -> x
		1 -> y
		else -> throw IndexOutOfBoundsException("Item não encontrado")
	}
}

fun main(args: Array<String>) {
	
	val p = Point(10, 20)
	
	println(p[0])
	println(p[1])
	println(p[2])
}