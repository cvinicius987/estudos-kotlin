package cap11.dsl_primitives

import java.time.LocalDate
import java.time.Period

//Define um propriedade de extensão
val Int.days:Period
    get() = Period.ofDays(this)

//Define um propriedade para manipular o periodo
//O operador - representa a chamada ao metodo minus()
val Period.ago: LocalDate
    get() = LocalDate.now() - this

//Define um propriedade para manipular o periodo
//O operador + representa a chamada ao metodo plus()
val Period.fromNow:LocalDate
    get() = LocalDate.now() + this

fun main(arr:Array<String>) {

    println(1.days.ago)

    println(1.days.fromNow)
}