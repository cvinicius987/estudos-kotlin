package cap10.reflection

import kotlin.reflect.KCallable

fun execution(number:Int)=println(number)

fun main(args: Array<String>) {
	
	//Vendo a funtion como uma interface de execu��o
	val kFunction:KCallable<Unit> = ::execution
	
	//Executa a fun��o com o metodo call, este metodo recebe uma varargs como paramentro
	//caso o parametro seja invalido ou a quantidade errada, acontece uma exception em runtime
	kFunction.call(40)
}