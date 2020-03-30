package cap9.variance_type

/*
 * Class ProcessCovariance, recebe um tipo T que deve ser um Shape ou um subtipo de Shape
 *
 * a palavra out marca o tipo como sendo COVARIANTE, em lugares onde temos a expressão
 * generica podemos passar um subtipo de T,
 * out deve ser utilizado como saida, ou seja operações de retorno ou leitura
 * Podem tambem ser atributos val e var(private) nos construtores
 */
class ProcessCovariance<out T : Shape>(val list:List<T>) : List<T> by list

/*
 * Metodo executeCovariance, espera um ProcessCovariance<Shape> sendo COVARIANTE,
 * ou seja, o tipo esperado é um ProcessCovariance<Shape> ou um ProcessCovariance<Subtipo de Shape>
 */	
fun executeCovariance(processCovariance:ProcessCovariance<Shape>) = processCovariance.forEach { println(it.points())}

fun main(args: Array<String>) {
	
	val circles = ProcessCovariance<Circle>(listOf(Circle(), Circle()))
	
	executeCovariance(circles)
}