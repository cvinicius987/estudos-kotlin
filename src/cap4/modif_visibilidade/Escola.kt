package cap4.modif_visibilidade

open class Escola{
	
    fun carteira() = "Carteira"

	internal fun cadeira() = "Cadeira"
	
	protected open fun lousa() = "Lousa"
	
	private fun aluno() = "Aluno"
}

class Sala : Escola(){
	
	public override fun lousa() = "Lousa da Sala"
}

fun main(args: Array<String>) {
	
	val escola = Escola()
	
	println(escola.carteira())
	println(escola.cadeira())
	
	val sala = Sala()
	
	println(sala.lousa())
}