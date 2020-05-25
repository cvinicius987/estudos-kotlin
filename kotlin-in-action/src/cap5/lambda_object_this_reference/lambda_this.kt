package cap5.lambda_this_reference

import java.util.function.Consumer

class TesteLambda{
	
	private val list = listOf("a", "b", "c")
	
	fun execute(){
		
		println("\n ============= Lambda: ")
		
		list.forEach {str ->
			println("This Lambda: $this")
			println("$str")
		}
		
		println("\n ============= Anonymouns: ")
		
		list.forEach(object : Consumer<String>{
			
			override fun accept(str:String){
				
				println("This Anonymouns: $this")
				println("$str")
			}
		})
	}
}

fun main(args: Array<String>) {
		
	val testeLambda = TesteLambda()
	
	testeLambda.execute()
}