package cap4.methods_universais

class Client(val name:String){
	
	override fun toString() = "Client($name)"
	
	override fun equals(other:Any?):Boolean {
		
		if(other != null && other is Client){
			return other.name == name
		}
		
		return false;
	}
	
	override fun hashCode():Int{
		return name.hashCode();
	}
	
	fun copy(name:String = this.name):Client{
		return Client(name)
	}
}

fun main(args: Array<String>) {
	
	val cli  = Client("Java")
	val cli2 = Client("Java")
	val cli3 = Client("Kotlin")
	
	println(cli)
	println(cli2)
	println(cli3)
	
	println(cli == cli2)   //true
	println(cli === cli2)  //false
	println(cli == cli3)  //false
	println(cli === cli3) //false
	
	println("\n\n =============== Hash")
	
	val list = hashSetOf(cli);
	
	println(list.contains(Client("Java"))) //true
	
	println("\n\n =============== Copy")
	
	val copy = cli.copy();
	
	println("$copy é uma copia de $cli, sendo equals: ${copy == cli}")
}