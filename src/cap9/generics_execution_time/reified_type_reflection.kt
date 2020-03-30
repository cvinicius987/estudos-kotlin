package cap9.reified_type

import java.util.ServiceLoader

inline fun <reified T> loadClass():ServiceLoader<T>{
	
	return ServiceLoader.load(T::class.java)
}

fun main(args: Array<String>) {
	
	println(loadClass<String>())
	println(loadClass<Int>())
}