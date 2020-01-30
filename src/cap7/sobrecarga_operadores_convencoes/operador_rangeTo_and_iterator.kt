package cap7.sobrecarga_operadores_convencoes

import java.time.LocalDate
import java.time.LocalTime

operator fun ClosedRange<LocalTime>.iterator():Iterator<LocalTime>{
	
	return object : Iterator<LocalTime>{
		
		var current = start
		
		override fun hasNext() = current <= endInclusive
		
		override fun next() = current.apply { current = plusHours(1) }
	}
}

fun main(args: Array<String>) {
	
	val entrada = LocalTime.of(11, 0)
	val saida	= LocalTime.of(20, 0)
	
	val result:ClosedRange<LocalTime> = entrada..saida
	
	for(time in result){
		
		println(time)
	}
}