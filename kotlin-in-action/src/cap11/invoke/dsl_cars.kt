package cap11.invoke

class Car{
	
	init{
		println("Criado o Carro.....")
	}
	
	operator fun invoke(engine:Engine, funEngine:Engine.() -> Unit){

		engine.funEngine()
	}
}

data class Engine(val type:Int)

fun main(args: Array<String>) {
	
	var car = Car()
	
	car(Engine(1)){
		
		println(this)
	}	
}