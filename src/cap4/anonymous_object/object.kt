package cap4.anonymouns_object

import java.util.function.Consumer

interface Ws{
	
	fun getJson():String
}

class Consumer{
	
	fun executeWs(ws:Ws) = ws.getJson()
}

fun main(args: Array<String>) {
	
	val consumer = Consumer()
	
	val result = consumer.executeWs(object : Ws {
		
		override fun getJson():String{
			
			return """{"key": "value"}"""
		} 
	})
	
	print(result)
}