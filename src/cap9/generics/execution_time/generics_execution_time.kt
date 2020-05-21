package cap9.generics_execution_time

//A verificação do cast em List<Int> não é possivel pois o tipo Int não esta presente em tempo de execução
//portanto apenas a verificação de List é executada com sucesso.
fun sumValues(coll:Collection<*>){
	
	val listNumber = coll as? List<Int> ?: throw IllegalArgumentException("Cast Invalido")
	
	val result = listNumber.sumBy { it }
	
	println(result)
}

//Aqui não temos mais o warning no cast, pois já recebemos um collection de Int
//então é certeza de recebermos Int, mas no cast a unica coisa verificada é se listNumber é um List
fun sumValuesByInt(coll:Collection<Int>){
	
	val listNumber = coll as? List<Int> ?: throw IllegalArgumentException("Cast Invalido")
	
	val result = listNumber.sumBy { it }
	
	println(result)
}

fun main(args: Array<String>) {
	
	//========================================= Função que recebe Collection<*>
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
	
	//========================================= Função que recebe Collection<Int>
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