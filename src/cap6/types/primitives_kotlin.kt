package cap6.primitives_wrappers

fun calcule(i:Int):Unit{
	
	val result = i.coerceIn(0, 100)
	
	println("Total de $result%")
}

fun main(args: Array<String>) {
	
	//Kotlin não faz distinção entre primitos e wrappers
	//Variaveis, paramentros de metodos, são compilados para primitivo
	val i:Int = 1
	
	calcule(i)
	
	//Lista de Int é compilada para Wrapper
	val list:List<Int> = listOf(15, 85, 152, 36, 78, 47, 12, 96)
	
	list.forEach {calcule(it)}
}