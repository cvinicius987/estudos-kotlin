package repeticao

fun main(){
	
	val list = arrayListOf("10", "11", "08")
	
	for((index, ele) in list.withIndex())
		println("Index: $index || Value: $ele")
}