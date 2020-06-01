package cap5.sequences

fun main(args: Array<String>) {
	
	val numbers = listOf(1,2,3,4,5,6, 7, 8, 8, 9, 10)
	
	println(" >>>> Eager")
	
	val resultEager = numbers.map({print("map($it) "); it * it})
							 .filter { print("filter($it) "); it % 2 == 0 }
			
	println("\n resultEager: $resultEager")
	
	println("\n\n >>>> Lazy: Map ==>> Filter")
	
	val resultLazyMapFilter = numbers.asSequence()
									.map({print("map($it) "); it * it})
							   	   	.filter { print("filter($it) "); it % 2 == 0 }
									.toList()
	
	println("\n resultLazyMapFilter: $resultLazyMapFilter")
	
	println("\n\n >>>> Lazy: Filter ==>> Map")
	
	val resultLazyFilterMap = numbers.asSequence()
									.filter { print("filter($it) "); it % 2 == 0 }
									.map({print("map($it) "); it * it})
									.toList()
	
	println("\n resultLazyFilterMap: $resultLazyFilterMap")
}