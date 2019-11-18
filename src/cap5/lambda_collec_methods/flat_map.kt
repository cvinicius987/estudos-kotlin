package cap5.lambda_collec_methods

data class Book(val title:String, val authors:List<String>)

fun main(args: Array<String>) {
	
	val books = listOf(Book("Java", 	listOf("Caio")),
					   Book("Kotlin", 	listOf("Caio", "Claudio")),
					   Book("C#", 		listOf("Fernanda")),
					   Book("GoLang", 	listOf("Eliana")))
	
	//Todos os autores, sem repetir
	println(books.flatMap { it.authors }.toSet())
	
	//Todos os autores
	println(books.flatMap { it.authors })
	
	//Pegar os autores do livro de java
	println(books.filter { it.title == "Java" }.flatMap { it.authors })
	
	//Pegar os autores do livro de java
	println(books.filter { it.title == "Java" }.flatMap { it.authors })
	
	//Pegar os autores do livro de java
	println(books.filter { it.authors.any({ it.startsWith("C") }) })
}