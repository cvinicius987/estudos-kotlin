package cap8.funcao_alta_ordem

fun invokeFromJava(msg:String, convertToInt:(String) -> Int) = println(convertToInt(msg))