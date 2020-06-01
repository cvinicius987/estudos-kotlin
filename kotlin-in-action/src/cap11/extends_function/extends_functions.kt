package cap11.extends_function

data class Product(val name:String, val price:Double, val type:Int)

//O estender um tipo fun��o, teremos que implementar um medtodo invoke ocm a assinatura do heran�a
class DefineProduct(val type:Int) : (Product) -> Boolean {
	
	override fun invoke(product: Product):Boolean{
		
		return product.type == type && product.price > 5.0
	}
}

fun main(args: Array<String>) {
	
	val listProducts = listOf(Product("TV", 6.0, 1), Product("Som", 5.5, 1), Product("Dvd", 4.0, 1), Product("Celular", 8.0, 2))
	
	val defineProduct = DefineProduct(1)
	
	listProducts.filter(defineProduct)
				.forEach { println(it) }
	
	println(" =============================== ")
	
	val defineProduct2 = DefineProduct(2)
	
	listProducts.filter(defineProduct2)
				.forEach { println(it) }
}