package cap3.functions

fun main(){
	
	val colSet = hashSetOf(1, 2, 3, 4, 5, 5)
	
	for(num in colSet){
		print("$num |")
	}
	
	print("\n\n")
	
	val colList = arrayListOf(1, 2, 3, 4, 5)
	
	for((index, value) in colList.withIndex()){
		print("$index : $value |")
	}
	
	print("\n\n")
	
	val map = hashMapOf(1 to "one", 2 to "two")
	
	for(value in map.asIterable()){
		print("$value |")
	}	
}
