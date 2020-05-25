package cap7.delegate

import kotlin.reflect.KProperty

class Name {
	
    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
		
        return "$thisRef, thank you for delegating '${property.name}' to me!"
    }
 
    operator fun setValue(thisRef: Any?, property: KProperty<*>, newValue: String) {
		
        println("$newValue has been assigned to '${property.name}' in $thisRef.")
    }
}

class Client{
	
	var name: String by Name()
}

fun main(args: Array<String>) {
	
	val client = Client()
	
	client.name = "Caio"
	
	println(client.name)
}