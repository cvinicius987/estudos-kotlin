package exception

import java.io.BufferedReader
import java.lang.NumberFormatException
import java.io.StringReader

fun readNumberTryExpression(reader: BufferedReader) =
	
	try{	
		val str = reader.readLine()
		
		Integer.parseInt(str)
		
	}catch(e:NumberFormatException){
		null
		
	}finally{
		reader.close()
	}

fun readNumber(reader: BufferedReader):Int{
	
	try{
		val str = reader.readLine()
		
		return Integer.parseInt(str)
		
	}catch(e:NumberFormatException){
		throw NumberFormatException("Impossivel realizar a conversão !!!")
		
	}finally{
		reader.close()
	}
}

fun main(){
	
	println(readNumberTryExpression(BufferedReader(StringReader("123456"))))
	
	println(readNumberTryExpression(BufferedReader(StringReader("teste"))))
	
	println(" ============================================ ")
	
	println(readNumber(BufferedReader(StringReader("123456"))))
	
	println(readNumber(BufferedReader(StringReader("teste"))))
	
}