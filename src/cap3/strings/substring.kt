package cap3.strings

import java.nio.file.Path
import java.nio.file.Paths

fun parsePath(path:String){
	
	val pathResult = path.substringBeforeLast("/")
		
	val nameFull = path.substringAfterLast("/")
	
	val name = nameFull.substringBeforeLast(".")
			
	val extension = nameFull.substringAfter(".")
		
	println("Path: $pathResult, Name: $name, Extensão: $extension")
}

fun main(args: Array<String>) {
	
	var pathStr = "/usr/var/lib/main.kt"
	
	parsePath(pathStr)
}