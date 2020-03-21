package cap2

import cap6.nullable.Company

class Company(){
	
	var customName:String = ""
		get(){
			return field
		} 
		set(s:String){
			field = s
		}
}

fun main(args: Array<String>) {
	
	val comp = Company()
	
	comp.customName = "Teste"
	
	println(comp.customName)
}