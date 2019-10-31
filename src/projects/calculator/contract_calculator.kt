package projects.calculator

import java.math.BigDecimal

interface Calculator{
	
	fun sum(value:Double, value2:Double):Double
	
	fun subtraction(value:Double, value2:Double):Double
	
	fun multiply(value:Double, value2:Double):Double
	
	fun division(value:Double, by:Int):Double
}