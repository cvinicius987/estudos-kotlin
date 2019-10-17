package cap3.varargs

fun listNumbers(vararg nums:Int){
	
	for((i, n) in nums.withIndex()){
		println("Index: $i | Value: $n")
	}
}

fun main(args: Array<String>) {
	
	listNumbers(1, 2, 3, 4)
	
	//Uso do operador espalhamento
	val arr:IntArray = intArrayOf(1, 2, 3, 4)
	
	listNumbers(5, *arr)
}