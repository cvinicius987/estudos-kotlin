package cap4.primary_constructor

//Construtor primario criado de maneira manual
class User(_name:String){
	val name:String
	
	init{
		name = _name
	}
}

//Construtor primario criado de maneira manual
class User2(_name:String){
	val name:String = _name
}

//Construtor primario
class User3(val name:String)

//Construtor primario criado private
class User4 private constructor(val name:String)

//Construtor primario, com atributos com valores default
class User5(val name:String, val idade:Int=0)

