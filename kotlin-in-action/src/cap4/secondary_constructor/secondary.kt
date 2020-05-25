package cap4.secondary_constructor

enum class Type{
	CAR, TRUCK, UNDEFINED;
}

open class Vehicle{
	
	constructor(name:String) : this(name, Type.UNDEFINED)
		
	constructor(name:String, type:Type){
		println("Car Name $name - Type : $type")
	}
}

class Car : Vehicle{
	
	constructor(name:String) : super(name, Type.CAR)
}

class Truck : Vehicle{
	
	constructor(name:String) : super(name, Type.TRUCK)
}

class Motorcycle : Vehicle{
	
	constructor(name:String) : super(name)
}

fun main(args: Array<String>) {
	
	Car("Gol")
	
	Truck("VW")
	
	Motorcycle("CG 150")
}