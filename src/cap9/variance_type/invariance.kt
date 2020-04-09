package cap9.variance_type

//Class Base de Shape
open class Shape {
	
  open fun points():Int = 0
}

//Classe circle herda Shape
class Circle : Shape(){
	
	override fun points() = 1
}

//Class ProcessShape, recebe um tipo T que deve ser um Shape ou um subtipo de Shape
class ProcessShape<T : Shape>(val list:List<T>) : List<T> by list
	
//Metodo executeProcessShape, espera um ProcessShape<Shape> sendo INVARIANTE, ou seja o tipo esperado é um ProcessShape<Shape>
fun executeProcessShape(processShape:ProcessShape<Shape>):Unit {
	
	processShape.forEach { println(it.points()) }
} 

fun main(args: Array<String>) {
		
	val shapes = ProcessShape<Shape>(listOf(Shape(), Shape()))
	
	executeProcessShape(shapes)
	
	val mutCircles:MutableList<Circle> = mutableListOf(Circle(), Circle())

	// ======================= Caso passar um ProcessInvariance<Circle> temos um erro de compilação devido a invariancia
	//executeProcessShape(ProcessShape<Circle>(mutCircles))
}