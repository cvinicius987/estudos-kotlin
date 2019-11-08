package cap4.objects

import java.util.Comparator

data class Client(val name:String, val age:Int){
	
	object CliCompare : Comparator<Client>{
		
		override fun compare(cli:Client, cli2:Client):Int{
			
			return cli.name.compareTo(cli2.name)
		}
	}
}

object CliCompareFromAge : Comparator<Client>{
	
	override fun compare(cli:Client, cli2:Client):Int{
		
		return cli.age.compareTo(cli2.age)
	}
}

fun main(args: Array<String>) {
	
	val list = arrayListOf(Client("Caio1", 10), Client("Caio3", 9), Client("Caio8", 30),
						   Client("Caio2", 35), Client("Caio7", 15), Client("Caio5", 12))
	
	for(cli in list)
		println(cli)
	
	println("\n")
	
	val listNameSorted = list.sortedWith(Client.CliCompare)
	
	for(cli in listNameSorted)
		println(cli)
	
	println("\n")
	
	val listAgeSorted = list.sortedWith(CliCompareFromAge)
	
	for(cli in listAgeSorted)
		println(cli)
	
}