package cap6.nullable

class MyService{
	
	lateinit var name:String
	
	fun initialize(){
		name = "Caio"
	}
}

fun main(args: Array<String>) {
	
	val my1 = MyService()
	
	my1.initialize()
	
	println(my1.name)
	
	//Causa exception devido a chamar um valor não inicializado
	val my2 = MyService()
	
	println(my2.name)
}