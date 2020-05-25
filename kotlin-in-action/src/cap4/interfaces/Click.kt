package cap4.interfaces

interface Button {
	
	fun setLabel(str:String)
	
	fun click(){
		println("Apertou o click em (Click)...")
	}
	
	fun action(){
		println("Ira enviar para...")
	}
}