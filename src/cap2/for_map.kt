package cap2

import java.util.TreeMap

fun main(){
	
	val binaryMap = TreeMap<Char, String>()
	
	for(l in 'A'..'F'){
		binaryMap[l] = Integer.toBinaryString(l.toInt())
	}
	
	for((letter, num) in binaryMap){
		println("$letter = $num")
	}
}