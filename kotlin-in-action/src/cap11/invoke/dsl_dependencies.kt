package cap11.invoke

class Dependency{
	
	fun compile(coord:String){
		println(" Added a dependency: $coord")
	}
	
	operator fun invoke(body: Dependency.() -> Unit){
		
		body()
	}
}

fun main(args: Array<String>) {
	
	val dependencies = Dependency()
	
	//Chama o metodo compile diretamente de Dependency
	dependencies.compile("kotlin.reflect")
	
	//Chama o metodo invoke, passando uma lambda com receptor
	//dentro da lambda temos acesso ao this do receptor, que no caso � Dependency
	dependencies {
		this.compile("org.springframework")
	}
}