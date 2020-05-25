package cap5.lambda

fun teste (r:Runnable){
	
	r.run()
}

fun main(args: Array<String>) {
	
	val r = Runnable {print("dfdf")}
	
	teste(r)
}