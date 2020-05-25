package cap7.delegate

import java.beans.PropertyChangeListener
import java.beans.PropertyChangeSupport
import kotlin.properties.Delegates
import kotlin.reflect.KProperty

open class PropertyChangeAware {

	protected val changeSupport = PropertyChangeSupport(this)
	
	fun addPropertyChangeListener(listener:PropertyChangeListener){
		changeSupport.addPropertyChangeListener(listener)
	}
	
	fun removePropertyChangeListener(listener:PropertyChangeListener){
		changeSupport.removePropertyChangeListener(listener)
	}
}

class ObservableProps(var propValue:Int, val changeSupport:PropertyChangeSupport){
	
	operator fun getValue(p:PersonChange, prop:KProperty<*>):Int = propValue
	
	operator fun setValue(p:PersonChange, prop:KProperty<*>, newValue:Int){
		
		val oldValue = propValue
		
		propValue = newValue
		
		changeSupport.firePropertyChange(prop.name, oldValue, newValue)
	}
}

class PersonChange(val name:String, age:Int, salary:Int) : PropertyChangeAware(){
	
	/*
 	 * Forma a traves de classe ObservableProps
 	 */
	var age:Int by ObservableProps(age, changeSupport)
	
	/*
     * Forma direta através de um function/lambda
 	 */
	val observer = {
			
		prop:KProperty<*>, oldValue:Int, newValue:Int -> changeSupport.firePropertyChange(prop.name, oldValue, newValue)
	}
	
	var salary:Int by Delegates.observable(salary, observer)
}

fun main(args: Array<String>) {

	val person = PersonChange("Andrien", 27, 1000)

	person.addPropertyChangeListener(
			PropertyChangeListener { event -> println("Property [${event.propertyName}] changed from [${event.oldValue}] to [${event.newValue}]") }
	)
	
	person.age = 28
	
	person.salary = 2000
}