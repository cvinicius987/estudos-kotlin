package cap10.reflection

class TesteReflection(val name:String, val number:Int)

fun main(args: Array<String>) {
	
	val teste = TesteReflection("teste", 10)
	
	//Reprenta o Class do arquivo Koltin KClass
	val testeKclass = teste.javaClass.kotlin
	
	println(testeKclass.simpleName)
	println(testeKclass.qualifiedName)
	
	testeKclass.members.forEach { println(it) }
}