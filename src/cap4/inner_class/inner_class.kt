package cap4.inner_class

class Form{
	
	class Input(val name:String, val size:Int)
}

class Menu(val banner:String){
	
	inner class Submenu(val title:String, val link:String){
		
		fun bannerMenu() = this@Menu.banner
	}
}

fun main(args: Array<String>) {
	
	val input = Form.Input("Campo", 20)
	
	println("Classe Aninhada: ${input.name} - ${input.size}")
	
	val menu = Menu("Menu do Site")
	
	val submenu = menu.Submenu("Titulo", "http://menu.com")
	
	println("Inner Class: ${submenu.title} - ${submenu.link} - ${submenu.bannerMenu()}")
}