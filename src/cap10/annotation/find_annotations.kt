package cap10.annotation

import ru.yole.jkid.findAnnotation
import kotlin.reflect.KClass

@Marc(symbol="-", restriction=Double::class)
data class Cpf(val number:String)

annotation class Marc(val symbol:String, val restriction:KClass<out Number>)

fun main(args: Array<String>) {
	
	val cpfClass = Cpf::class
	
	val returnValue = cpfClass.findAnnotation<Marc>()
	
	println(returnValue?.symbol)
	println(returnValue?.restriction)
}