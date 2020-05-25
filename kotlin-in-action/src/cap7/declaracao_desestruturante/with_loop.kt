package cap7.declaracao_desestruturante

fun main(args: Array<String>) {
	
	val map = mapOf("Oracle" to "Java", "Microsoft" to "C#", "JetBrains" to "Kotlin")
	
	//Declaração desestruturante aplicada a iteração de dados em laços
	for((company, language) in map){
		
		println("Empresa: $company Linguagem: $language")
	}
}