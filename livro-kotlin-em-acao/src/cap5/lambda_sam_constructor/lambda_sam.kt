package cap5.lambda_sam_constructor

fun main(args: Array<String>) {
	
	fun newMessage():Runnable{
		
		return Runnable { println("Aqui......") }
	}
	
	newMessage().run()
}