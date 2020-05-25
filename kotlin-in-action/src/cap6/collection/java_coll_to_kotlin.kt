package cap6.collection_java

fun changeToUppercase(list:MutableList<String>){
	
	for((index, str) in list.withIndex())
		list[index] = str.toUpperCase()
}