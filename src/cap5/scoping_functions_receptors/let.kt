
 fun main(args: Array<String>) {
	
	 val msg:String = "Mensagem...."
	 
	 val msgNull:String? = null
	 
	 //Fz uma conversão
	 val totalChars:Int = msg.let { it.length }
	 
	 println(totalChars)
	 
	 msgNull?.let { println("Valor: $it") }
}