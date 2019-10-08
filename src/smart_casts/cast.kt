package smart_casts

interface Expr

class Num(val value:Int) : Expr{
	
	override fun toString() = "(Num)"
}

class Sum(val left:Expr, val right:Expr) : Expr{
	
	override fun toString() = "(Sum)"
}

//Basico com instru��es IF
fun evalBasic(e:Expr):Int{
	if(e is Num){
		val n = e as Num
		return n.value 
	}
	if (e is Sum){
		return evalBasic(e.left) + evalBasic(e.right)
	}
	
	throw IllegalArgumentException("Unknown expressions")
}

//Basico com instru��es When
fun evalWhen(e:Expr)= when(e){
	is Num -> e.value
	is Sum -> evalBasic(e.left) + evalBasic(e.right)
	else -> throw IllegalArgumentException("Unknown expressions")
}

//Basico com instru��es When
fun evalWhenWithLog(e:Expr)= when(e){
	is Num -> {
		println(">> $e � do tipo Num")
		e.value
	} 
	is Sum -> {
		println(">> $e � do tipo Sum")
		evalBasic(e.left) + evalBasic(e.right)
	}
	else -> throw IllegalArgumentException("Unknown expressions")
}


fun main(){
	
	println(" ============= Basic")
	println(evalBasic(Num(10)))
	
	println(" ============= When")
	println(evalWhen(Num(10)))
	
	println(" ============= When with Log")
	println(evalWhenWithLog(Num(10)))
}