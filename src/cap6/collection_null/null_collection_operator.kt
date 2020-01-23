package cap6.null_collection

fun processList(list:List<Int?>):Pair<Int, Int>{
	
	var elementsNotNull = 0
	var elementsNull = 0
	
	for(number in list){
		
		if(number != null){
			elementsNotNull++
		}
		else{
			elementsNull++
		}
	}
	
	return elementsNotNull to elementsNull
}

fun processListNew(list:List<Int?>):Pair<Int, Int>{
	
	var elementsNotNull = list.filterNotNull().count()
	var elementsNull 	= list.filterNot {it != null}.count()
	
	return elementsNotNull to elementsNull
}

fun main(args: Array<String>) {
	
	val list:List<Int?> = listOf(null, 2, 3, 4, 5, 6, null, null, 10)
	
	val result = processList(list)
	
	println("Total elementos não nulls: ${result.component1()} || Total elementos null: ${result.component2()} ")
	
	print("\n\n")
	
	val resultNew = processListNew(list)
	
	println("Total elementos não nulls: ${resultNew.component1()} || Total elementos null: ${resultNew.component2()} ")
}