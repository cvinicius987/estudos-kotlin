package enums

enum class Color(val hexa:String) {
	
	BLACK("#000"), WHITE("#FFF"), BLUE("#0000FF"), RED("#FF0000");
	
	fun showHexa() = "Seu HEXA é: $hexa"
}

fun translate(color:Color) = when(color){
	Color.BLACK -> "Sua cor é Preta"
	Color.WHITE -> "Sua cor é Branca"
	Color.BLUE -> "Sua cor é Azul"
	else -> "Cores não encontrada...."
}

fun translateWithoutCondition(color:Color) = when{
	color == Color.BLACK -> "Sua cor é Preta"
	color == Color.WHITE -> "Sua cor é Branca"
	color == Color.BLUE -> "Sua cor é Azul"
	else -> "Cores não encontrada...."
}

fun main(){
	
	println(Color.BLACK.hexa);
	
	println(Color.WHITE.showHexa());
	
	println(translate(Color.BLUE));
	
	println(translate(Color.RED));
	
	println(translate(Color.WHITE));
	
}