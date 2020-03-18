package cap8.funcao_alta_ordem

/*
 * O inline irá adicionar o bloco de codigo presente na função como sendo parte do mesmo bytecode gerado
 * é util para função que seram chamadas varias vezes ou dentro de loop diminuindo o overhead de chamadas
 * tomar cuidado e usar em lugares corretos para evitar ter um bycode muito grande, e tambem o uso pode afetar
 * a correta leitura do stacktrace de erro.
 */
inline fun repeatText(text:String, times:() -> Int):String{

	val builder = StringBuilder()
	
	var count = 0
	
	while(count < times()){
		builder.append("\n")
			   .append(text)
		
		count++
	}
	
	return builder.toString()
}

fun main(args: Array<String>) {
	
	var result = repeatText("teste"){ 2 }
	
	println(result)
}