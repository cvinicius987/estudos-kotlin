package cap4.modif_estado

interface Sudeste {
	
	fun state():String;
}

abstract class Estado : Sudeste

class SP : Estado(){
	
	override fun state() = "São Paulo"
}

open class RJ : Estado(){
	
	override fun state() = "Rio de Janeiro"
	
	open fun capital() = "Rio de Janeiro"
	
	final fun praia() = "Copacabana"
}

class MG : RJ(){
	
	override fun state() = "Minas Gerais"
	
	override fun capital() = "Belo Horizonte"
}