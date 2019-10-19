package cap4.interfaces

class Form : Button, Link {
	
	override fun text(str:String){
		
		println("O texto do link sera: $str")
	}
	
	override fun setLabel(str:String){
		println("O label do botao sera: $str")
	}
	
	//Quando ambas as interfaces possuem o default method com mesmo nome
	override fun click(){
		super<Button>.click()
		super<Link>.click()
	}
}

fun main(args: Array<String>) {
	
	val form  = Form()
	
	form.text("Link para outro site")
	
	form.setLabel("Enviar")
	
	form.action()
	
	form.click()
}