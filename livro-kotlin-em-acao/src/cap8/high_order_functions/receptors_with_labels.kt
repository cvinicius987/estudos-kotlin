package cap8.funcao_alta_ordem

fun main(args: Array<String>) {
	
	//Acrescenta um label sb@ para o apply que manipula StringBuilder
	val str = StringBuilder().apply sb@{
		
		listOf("A", "B", "C").apply {
			
			//aqui this@sb acessa a StringBuilde do primeiro apply
			//this representa o apply da lista de String
			this@sb.append(this)
		}
	}
	
	println(str)
}