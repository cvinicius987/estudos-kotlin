package cap8.funcao_alta_ordem

fun removeDotToPipe(str:String, changeSpecialChar:(() -> String)={"."}):String{
	
	return str.replace(changeSpecialChar(), "|")
}

fun main(args: Array<String>) {
	
	println(removeDotToPipe(".no final tudo ficara bem."))
	
	println(removeDotToPipe(".no final tudo ficara bem.", {";"}))
	
	println(removeDotToPipe("&no final tudo ficara bem&", {"&"}))
}