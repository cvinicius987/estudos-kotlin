package cap7.declaracao_desestruturante

fun main(args: Array<String>) {
	
	val map = mapOf("Oracle" to "Java", "Microsoft" to "C#", "JetBrains" to "Kotlin")
	
	//Declara��o desestruturante aplicada a itera��o de dados em la�os
	for((company, language) in map){
		
		println("Empresa: $company Linguagem: $language")
	}
}