package cap5.sequences

fun main(args: Array<String>) {
	
	val numbers = listOf(1,2,3,4,5,6, 7, 8, 8, 9, 10)
	
	eagerMapFilter(numbers)
	eagerFilterMap(numbers)
	
	println("\n\n\n =================================== \n\n\n ")
	
	lazyMapFilter(numbers)
	lazyFilterMap(numbers)
}
	

private fun eagerMapFilter(numbers:List<Int>):Unit{
	
	println(" >>>> Eager: Map ==>> Filter")
	
	val resultEager = numbers.map({print("map($it) "); it * it})
							 .filter { print("filter($it) "); it % 2 == 0 }
			
	println("\n resultEager: $resultEager")
}

private fun eagerFilterMap(numbers:List<Int>):Unit{
	
	println(" >>>> Eager: Filter ==>> Map")
	
	val resultEager = numbers.filter { print("filter($it) "); it % 2 == 0 }
							 .map({print("map($it) "); it * it})
			
	println("\n resultEager: $resultEager")
}


private fun lazyMapFilter(numbers:List<Int>):Unit{

	println("\n\n >>>> Lazy: Map ==>> Filter")
	
	val resultLazyMapFilter = numbers.asSequence()
								.map({print("map($it) "); it * it})
						   	   	.filter { print("filter($it) "); it % 2 == 0 }
								.toList()
	
	println("\n resultLazyMapFilter: $resultLazyMapFilter")
}

private fun lazyFilterMap(numbers:List<Int>):Unit{
	
	println("\n\n >>>> Lazy: Filter ==>> Map")
	
	val resultLazyFilterMap = numbers.asSequence()
									.filter { print("filter($it) "); it % 2 == 0 }
									.map({print("map($it) "); it * it})
									.toList()
	
	println("\n resultLazyFilterMap: $resultLazyFilterMap")
}
