package cap10.reflection

import kotlin.reflect.KProperty

class ExampleProperty(val name:String, var age:Int)

fun main(args: Array<String>) {
	
	val exampleProperty = ExampleProperty("Caio", 20)
	
	//Propriedade Val
	val memberPropertyVal = ExampleProperty::name
		
	println(memberPropertyVal.get(exampleProperty))
	
	////Propriedade Var
	val memberPropertyVar = ExampleProperty::age
	
	println(memberPropertyVar.get(exampleProperty))
	
	memberPropertyVar.set(exampleProperty, 12)
	
	println(memberPropertyVar.get(exampleProperty))
}