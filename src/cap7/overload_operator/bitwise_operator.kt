package cap7.overload_operator

//Para operadores bitwise existem vários metodos, mas não é possivel realizar a sobrecarga
//com isso podemos utilizar a chamada infix nos diversos metodos existentes para manipular
//dados binários
fun main(args: Array<String>) {
	
	println(0x0F and 0xF0)
	
	println(0x0F or 0xF0)
	
	println(0x1 shl 4)
}