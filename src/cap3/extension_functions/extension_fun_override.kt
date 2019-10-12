package cap3.extension_functions

open class View {
	open fun show() = println("Eu sou View....")
}

class Button : View(){
	override fun show() = println("Eu sou Buton....")
}

fun View.showOff() = println("Eu sou View com OFF....")

fun Button.showOff() = println("Eu sou Button com OFF....")

fun main(args: Array<String>) {
	
	println(" ========== Primeiro Exemplo")
	
	val view:View = Button();
	
	view.show()    //Metodo membro chamada da instancia
	view.showOff() //Metodo de extensão chamada da referencia
}