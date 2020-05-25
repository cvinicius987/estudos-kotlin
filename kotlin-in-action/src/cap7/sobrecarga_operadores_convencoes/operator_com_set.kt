package cap7.sobrecarga_colecoes_intervalos

import java.lang.IndexOutOfBoundsException
import cap7.MutablePoint

operator fun MutablePoint.set(index:Int, newValue:Int):Unit{
	
	when(index){
		0 -> one = newValue
		1 -> two = newValue
		else -> throw IndexOutOfBoundsException("Item não encontrado")
	}
}

fun main(args: Array<String>) {
	
	val p = MutablePoint(10, 20)
	
	println(p)
	
	p[0] = 100
	p[1] = 500
	
	println(p)
}