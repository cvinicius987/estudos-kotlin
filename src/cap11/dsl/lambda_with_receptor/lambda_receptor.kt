package cap11.dsl.lambda_with_receptor

//o buildAction se torna uma função da StringBuilder dentro do escopo do metodo
fun buildString(buildAction:StringBuilder.() -> Unit):String{
	
	val sb = StringBuilder();
	
	sb.buildAction()
	
	return sb.toString()
}

fun buildStringInt(sumLengthPlusNumbers:String.(Int, Int) -> Int):String{
	
	val str = "Kotlin";
	
	val pair = 1 to 2
	
	val result = str.sumLengthPlusNumbers(pair.component1(), pair.component2())
	
	return "A palavra: $str possui ${str.length} + Soma de $pair ==>> $result"
}

fun main(args: Array<String>) {
	
	//Exemplo 1
	val s = buildString {
		this.append("String 1 ")
		this.append("String 2")
	}
	
	println(s)
	
	//Exemplo 2
	val str = buildStringInt { i, z -> ((i + z) + length)}
	
	println(str)
}