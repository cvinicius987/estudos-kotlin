package cap11.dsl

interface Matcher<T>{
	
	fun test(value:T)
}

//Aqui ignora as convenções de nome de Class devido a chamada ser fluente
class startWith(val str:String) : Matcher<String>{
	
	override fun test(value:String){
		
		return if(value.startsWith(str)){
			println(" Sim, a variavel $value COMEÇA com os caracteres $str")
		}
		else
			println(" Não, a variavel $value NÂO começa com $str")
	}
}

//Objeto usado como parametro no metodo infixo de start, usado como gramatica
object start

class StartWrapper(val value:String){
	
	infix fun with(prefix:String){
	
		return if(value.startsWith(prefix)){
			println(" Sim, a variavel $value COMEÇA com os caracteres $prefix")
		}
		else
			println(" Não, a variavel $value NÂO começa com $prefix")	
	}
}

//Metodo infixo com extensão para o Tipo do Matcher
infix fun <T> T.should(matcher:Matcher<T>) = matcher.test(this)

//Metodo infixo com extensão para o Tipo String
infix fun String.should(x:start):StartWrapper = StartWrapper(this)

fun main(args: Array<String>) {
	
	"Kotlin" should startWith("Java")
	
	"Kotlin" should startWith("Kot")
	
	"Kotlin" should start with "Kot"
}