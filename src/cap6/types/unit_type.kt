package cap6.types

interface Console<T>{
	
	fun show(msg:String):T
	
	fun defaultShow():Unit{
		
		println("Classe Console...")
	}
}

class ConsoleImpl : Console<Unit>{
	
	override fun show(msg:String){
		println(msg)
	}
}

fun main(args: Array<String>) {
	
	val console = ConsoleImpl()
	
	console.show("Mensagem....")
	console.defaultShow()
}