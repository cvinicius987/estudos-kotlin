package cap11.dsl

interface Matcher<T>{
	
	fun test(value:T)
}

//Aqui ignora as conven��es de nome de Class devido a chamada ser fluente
class startWith(val str:String) : Matcher<String>{
	
	override fun test(value:String){
		
		return if(value.startsWith(str)){
			println(" Sim, a variavel $value COME�A com os caracteres $str")
		}
		else
			println(" N�o, a variavel $value N�O come�a com $str")
	}
}

//Objeto usado como parametro no metodo infixo de start, usado como gramatica
object start

class StartWrapper(val value:String){
	
	infix fun with(prefix:String){
	
		return if(value.startsWith(prefix)){
			println(" Sim, a variavel $value COME�A com os caracteres $prefix")
		}
		else
			println(" N�o, a variavel $value N�O come�a com $prefix")	
	}
}

//Metodo infixo com extens�o para o Tipo do Matcher
infix fun <T> T.should(matcher:Matcher<T>) = matcher.test(this)

//Metodo infixo com extens�o para o Tipo String
infix fun String.should(x:start):StartWrapper = StartWrapper(this)

fun main(args: Array<String>) {
	
	"Kotlin" should startWith("Java")
	
	"Kotlin" should startWith("Kot")
	
	"Kotlin" should start with "Kot"
}