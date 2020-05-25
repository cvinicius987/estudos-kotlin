package cap8.funcao_alta_ordem

fun positionLetter(str:String, findSpecific:(() -> Char)?=null):Int{
	
	fun alphabet(char:Char):Int{
		
		var result = 0;
		
		for((index, alpha) in ('A'..'Z').withIndex()){
		
			if(char.toUpperCase() == alpha){
				
				result = index
				break
			}
		}
		
		return result
	}
	
	return if(findSpecific == null){
		str.toCharArray().map { alphabet(it) }.sum()
	}
	else{
		alphabet(findSpecific())
	}
}

fun main(args: Array<String>) {
	
	println(positionLetter("teste"))
	
	println(positionLetter("teste") {'t'})
}
	
	