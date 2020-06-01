package cap5.sequences

fun main(args: Array<String>) {
	
	val sequence = generateSequence(0) { it + 1 }
	
	val numbersToTen = sequence.takeWhile { it <= 9 }
	
	numbersToTen.forEach { println(it) }
}