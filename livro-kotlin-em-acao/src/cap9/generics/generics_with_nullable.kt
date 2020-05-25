package cap9.generics

//Todo tipo declara um tipo T sem restrições
//pode receber qualquer Any?, portento aceita null como parametro
class Process<T>{
	
	fun process(value:T){
		
		println(value?.hashCode())
	}
}

//Aqui colocamos uma restrição, onde podemos receber qualquer objeto
//mas não podemos receber null como parametro
class ProcessNonNull<T : Any>{
	
	fun process(value:T){
		
		println(value.hashCode())
	}
}

fun main(args: Array<String>) {
	
	val process = Process<String?>()
	
	process.process(null)
	
	val processNonNull = ProcessNonNull<String>()
	
	processNonNull.process("teste")
}