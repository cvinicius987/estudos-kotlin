package repeticao

fun isLetter(c:Char) = c in 'a'..'z' || c in 'A'..'Z'

fun isNotDigit(c:Char) = c !in '0'..'9'

fun main(){
	println(isLetter('c'));
	println(isNotDigit('8'));
	println(isNotDigit('X'));
}