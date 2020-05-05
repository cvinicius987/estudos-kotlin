package cap5.build_stringbuilder

fun main(args: Array<String>) {
	
	val createStr = buildString {
						append(" Criacao de String ")
						append(" com ")
						append(" StringBuilder ")
					}
	
	println(createStr)
}