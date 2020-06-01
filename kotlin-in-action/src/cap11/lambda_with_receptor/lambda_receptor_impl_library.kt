package cap11.lambda_with_receptor

//o buildAction se torna uma função do T dentro do escopo do metodo
//Dentro da lambda podemos acessar todos as propriedades do parametro com this
//Executa a lambda passada e retorna o this
inline fun <T> T.copyApply(buildAction:T.() -> Unit):T{
	
	this.buildAction()
	
	return this
}

//o buildAction se torna uma fun��o do parametro T dentro do escopo do metodo
//Dentro da lambda (fun��o buildAction) podemos acessar todos as propriedades do parametro T como this, porque ela faz parte do objeto
//O valor de R, ser� definido atrav�s do valor do resultado da express�o lambda
inline fun <T, R> copyWith(param:T, buildAction:T.() -> R):R{
	
	return param.buildAction()
}

fun main(args: Array<String>) {
	
	val name = StringBuilder("Kotlin")
	
	val result = name.copyApply {
		this.append(" + ")
		this.append("Java")
	}
	
	println(result)
	
	
	val client = "Client"
	
	var resultWith = copyWith(client) {
		length * 2
	}
	
	println(resultWith)
}