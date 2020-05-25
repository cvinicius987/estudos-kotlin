package cap6.null_platform_type

class StringProcessorNull : StringProcessor{
	
	override fun processor(value:String?):Unit{
		
		println(value?.toUpperCase() ?: "Valor Null...")
	}
}

class StringProcessorNotNull : StringProcessor{
	
	override fun processor(value:String):Unit{
		
		println(value.toUpperCase())
	}
}

fun main(args: Array<String>) {
	
	val strNull = StringProcessorNull()
	
	val strNotNull = StringProcessorNotNull()
	
	strNull.processor(null)
	
	strNotNull.processor("Realizado o processamento")
}