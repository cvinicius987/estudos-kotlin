package enums

enum class Color(val hexa:String) {
	
	BLACK("#000"), WHITE("#FFF"), BLUE("#0000FF"), RED("#FF0000");
	
	fun showHexa() = "Seu HEXA �: $hexa"
}

fun translate(color:Color) = when(color){
	Color.BLACK -> "Sua cor � Preta"
	Color.WHITE -> "Sua cor � Branca"
	Color.BLUE -> "Sua cor � Azul"
	else -> "Cores n�o encontrada...."
}

fun translateWithoutCondition(color:Color) = when{
	color == Color.BLACK -> "Sua cor � Preta"
	color == Color.WHITE -> "Sua cor � Branca"
	color == Color.BLUE -> "Sua cor � Azul"
	else -> "Cores n�o encontrada...."
}

fun main(){
	
	println(Color.BLACK.hexa);
	
	println(Color.WHITE.showHexa());
	
	println(translate(Color.BLUE));
	
	println(translate(Color.RED));
	
	println(translate(Color.WHITE));
	
}