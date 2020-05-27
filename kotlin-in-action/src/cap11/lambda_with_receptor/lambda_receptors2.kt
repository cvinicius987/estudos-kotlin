package cap11.dsl

fun fn(fnStr:String.(Int) -> Unit){
	
    val value = "Funcao fn"
    
    value.fnStr(10)
}

fun fnNew(num:Int, fnStr:String.(Int) -> Unit){
	
    val value = "Funcao fnNew"
    
    value.fnStr(num)
}

fun main() {
    
    //Declarativo
    fn({num:Int -> println("$this $num")})
    
    //Implicito
    fn({num -> println("$this $num")})
  
    //Implicito com parametro
  	fnNew(10){
        println("$this $it")
    }
}