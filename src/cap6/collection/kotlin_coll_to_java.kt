package cap6.collection_java

import cap6.collection.CollectionProcess

fun main(args: Array<String>) {
	
	val list:List<String> = listOf("java", "Kotlin", "c++")
	
	CollectionProcess.convertContentToUppercase(list)
	
	list.forEach {println(it)}
}