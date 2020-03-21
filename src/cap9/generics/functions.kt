package cap9.generics

fun main(args: Array<String>) {
	
	val letters = ('a'..'z').toList()
	
	//declarando o tipo que devemos manipular
	println(letters.slice<Char>(0..2))
	
	//Compilador infere de acordo com o conteudo
	println(letters.slice(5..10))
}