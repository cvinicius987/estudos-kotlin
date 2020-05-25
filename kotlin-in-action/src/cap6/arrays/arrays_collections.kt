package cap6.arrays

fun showNumbers(arr:Array<Int>){
	
	println(arr.joinToString())
}

fun showNumbersPrimitivos(arr:IntArray){
	
	println(arr.joinToString())
}

fun main(args: Array<String>) {
	
	//Uso de Arrays com Collection
	val numbers = listOf(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20)
	
	showNumbers(numbers.toTypedArray())
	
	showNumbersPrimitivos(numbers.toIntArray())
}