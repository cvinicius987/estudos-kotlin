package cap4.companion_objects

fun <T> executeWs(ws:Ws<T>, json:String) = ws.fromJson(json)
			
interface Ws<T>{
	
	fun fromJson(json:String):T
}

class WsRest(val texto:String){
	
	companion object Rest : Ws<WsRest>{
		
		override fun fromJson(json:String): WsRest{
			
			return WsRest(json.toUpperCase())
		}
	}
}

fun main(args: Array<String>) {
	
	val result = executeWs(WsRest, "texto")
	
	println(result.texto)
}