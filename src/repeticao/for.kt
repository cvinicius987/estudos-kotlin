package repeticao

fun testBuzz(i:Int) =  when {
	i % 15 == 0 -> "FizzBuzz"
	i % 3 == 0 -> "Fizz"
	i % 5 == 0 -> "Buzz"
	else -> "$i"
}
	

fun main(){
	
	for(i in 1..100){
		println(testBuzz(i))
	}
	
	println("\n==================================");
	
	for(i in 100 downTo 1 step 2){
		println(testBuzz(i))
	}
	
	println("\n==================================");
	
	for(i in 1 until 100){
		println(testBuzz(i))
	}
}