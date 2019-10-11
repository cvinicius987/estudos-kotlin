package cap3.functions

fun completeName(name:String, middleName:String, lastName:String)="Name: $name | Middle Name: $middleName | Last Name: $lastName"

fun completeNameDefault(name:String, middleName:String=" - ", lastName:String= " - ")=completeName(name, middleName, lastName)

fun main(){
	
	println(completeName("Caio", "Vinicius", "Oliveira"))
	
	println(completeName(lastName="Oliveira", name="Caio", middleName="Vinicius"))
	
	println(completeNameDefault(name="Caio"))
	
	println(completeNameDefault(lastName="Oliveira", name="Caio"))	
}