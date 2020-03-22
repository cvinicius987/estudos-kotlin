package cap9.generics_execution_time

//A verifica��o do cast em List<Int> n�o � possivel pois o tipo Int n�o esta presente em tempo de execu��o
//portanto apenas a verifica��o de List � executada com sucesso.
fun sumValues(coll:Collection<*>){
	
	val listNumber = coll as? List<Int> ?: throw IllegalArgumentException("Cast Invalido")
	
	val result = listNumber.sumBy { it }
	
	println(result)
}

//Aqui n�o temos mais o warning no cast, pois j� recebemos um collection de Int
//ent�o � certeza de recebermos Int, mas no cast a unica coisa verificada � se listNumber � um List
fun sumValuesByInt(coll:Collection<Int>){
	
	val listNumber = coll as? List<Int> ?: throw IllegalArgumentException("Cast Invalido")
	
	val result = listNumber.sumBy { it }
	
	println(result)
}

fun main(args: Array<String>) {
	
	//========================================= Fun��o que recebe Collection<*>
	try{
		sumValues(setOf(1, 2, 3))
		
	}catch(ex:Exception){
		println(ex)
	}
	
	try{
		sumValues(listOf("a", "b", "c"))
		
	}catch(ex:Exception){
		println(ex)
	}
	
	try{
		sumValues((1..10).toList())
		
	}catch(ex:Exception){
		println(ex)
	}
	
	//========================================= Fun��o que recebe Collection<Int>
	try{
		sumValuesByInt(setOf(1, 2, 3))
		
	}catch(ex:Exception){
		println(ex)
	}
	
	try{
		sumValuesByInt((1..10).toList())
		
	}catch(ex:Exception){
		println(ex)
	}
}