package cap9.variance_type

//Criamos uma função onde recebemos um função com Circle (Circle ou um supertipo) -> Number (number é out então podemos devolver number ou um subtipo)
fun listShapes(f:(Circle) -> Number) = println(f(Circle()))

class Triangle : Shape(){
		
	override fun points() = 3
}

/*
 * Aqui como exemplo de CONTRAVARIANTE utilizamos a função Function1<in P, out R>
 * o in marca a hierarquia de subtipos de forma inversa, onde:
 * Consumer<A> é subtipo d Consumer<B> quando B for subtipo de A
 *
 * in deve ser usado para receber o tipo marcado ou um supertipo do mesmo
 * in deve ser usado como parametro de entrada
 */
fun main(args: Array<String>) {
	
	val fn:Function1<Shape, Number> = {shape -> shape.points()}
    
	listShapes(fn)
	
	//val fn2:Function1<Triangle, Number> = {shape -> shape.points()}
	
	//=================================== Não compila pois listShapes espera um <in Circle> como entrada
	//listShapes(fn2)
}