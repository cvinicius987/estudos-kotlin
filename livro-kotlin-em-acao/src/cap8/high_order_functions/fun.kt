package cap8.high_order_functions

fun main(args: Array<String>) {
	
	val sum    = {x:Int, y:Int -> x + y}
	val action = {str:String -> println(str)}
	
	println(sum(10, 20))
	action("Kotlin....")
	
	val sumTwo:(Int, Int) -> Int   = {x, y -> x + y}
	val actionTwo:(String) -> Unit = {str -> println(str)}
	
	println(sumTwo(10, 20))
	actionTwo("Kotlin....")
}