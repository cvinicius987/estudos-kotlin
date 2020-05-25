package cap7.sobrecarga_operadores_convencoes

import java.time.LocalDate

fun main(args: Array<String>) {
	
	val now = LocalDate.now()
	
	//Objeto ClosedRange
	val vacation = now..now.plusMonths(1)
	
	println("Hoje: $now Ferias: $vacation")
	
	//Verifica se o objeto esta dentro do Range com o operador in
	println(now.plusWeeks(2) in vacation)
}