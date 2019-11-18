package cap4.methods_universais

data class ClientData(val name:String)

fun main(args: Array<String>) {
	
	val cli  = ClientData("Java")
	val cli2 = ClientData("Java")
	val cli3 = ClientData("Kotlin")
	
	println(cli)
	println(cli2)
	println(cli3)
	
	println(cli == cli2)   //true
	println(cli === cli2)  //false
	println(cli == cli3)  //false
	println(cli === cli3) //false
	
	println("\n\n =============== Hash")
	
	val list = hashSetOf(cli);
	
	println(list.contains(ClientData("Java"))) //true
	
	println("\n\n =============== Copy")
	
	val copy = cli.copy();
	
	println("$copy é uma copia de $cli, sendo equals: ${copy == cli}")
}