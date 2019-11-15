package cap5.lambda_first

fun main(args: Array<String>) {
	
	val list = listOf(Person("Caio", 12), Person("Fernanda", 70), Person("Claudio", 5), Person("Maria", 30))
	
	//Lambda como função
	val getAge = {p:Person -> p.age}
	
	getAge(Person("Caio", 12))
	
	list.maxBy(getAge)
	
	//Lambda normal
	list.maxBy({p:Person -> p.age})
	
	//Lambda com inferencia de tipos
	list.maxBy({p -> p.age})
	
	//Lambda fora dos parenteses, funciona somente se a lambda for o ultimo parametro do metodo
	list.maxBy(){p -> p.age}
	
	//Lambda se a lambda for o unico parametro do metodo podemos remover o parentese
	list.maxBy{p -> p.age}
	
	//Lambda com um paramentro, podemos utilizar a referencia it local
	list.maxBy{ it.age }
	
	//Lambda pode ter mais de uma operação, sendo a ultima o resultado
	val sum = { x: Int, y: Int ->
       println("Computing the sum of $x and $y...")
       x + y
    }
	
    println(sum(1, 2))
}