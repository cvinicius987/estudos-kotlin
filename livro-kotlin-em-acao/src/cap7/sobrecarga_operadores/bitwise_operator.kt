package cap7.overload_operator

//Para operadores bitwise existem v�rios metodos, mas n�o � possivel realizar a sobrecarga
//com isso podemos utilizar a chamada infix nos diversos metodos existentes para manipular
//dados bin�rios
fun main(args: Array<String>) {
	
	println(0x0F and 0xF0)
	
	println(0x0F or 0xF0)
	
	println(0x1 shl 4)
}