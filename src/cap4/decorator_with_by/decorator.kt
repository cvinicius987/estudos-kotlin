package cap4.decorator_with_by

class CustomList<T>(val myList:MutableList<T>) : MutableList<T> by myList{
	
	override fun add(element:T):Boolean{
		
		println(" >>> Adicionado o elemento [$element]")
		
		return myList.add(element)
	}
}

fun main(args: Array<String>) {
	
	val custom = CustomList<String>(arrayListOf());
	
	custom.add("teste")
	
	println(custom.size)
}