package cap10.reflection

import java.lang.StringBuilder

class TesteReflection(val name:String, val number:Int)

fun main(args: Array<String>) {
	
	val teste = TesteReflection("teste", 10)
	
	val testeKclassRight = TesteReflection::class
	
	//Reprenta o Class do arquivo Koltin KClass
	val testeKclass = teste.javaClass.kotlin
	
	println(testeKclassRight == testeKclass)
	println(testeKclass.simpleName)
	println(testeKclass.qualifiedName)
	
	testeKclass.members.forEach { println(it) }
	
}