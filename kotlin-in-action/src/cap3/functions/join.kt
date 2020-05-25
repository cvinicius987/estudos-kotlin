package cap3.functions

fun <T> joinToString(list:Collection<T>,
					 init:String=" | ",
					 delimiter:String=", ",
					 last:String=" | "):String{
	
	val str = StringBuilder(init)
	
	for((index, element) in list.withIndex()){
		
		if(index > 0) str.append(delimiter)
		
		str.append(element)
	}
	
	str.append(last)
	
	return str.toString()
}

fun main(args: Array<String>) {
	
	val list = arrayListOf(1,2,3,4,5,6,7,8,9,10)
	
	println(joinToString(list, init="(Inicio) ", last=" (Termino)"));
	
	println(FIX_NUMBER)
}