package cap4.interface_props

interface Category{
	val name:String
	
	val type:Int
	get() = 1
}

class Tv(override val name:String) : Category{
	
	override val type = 10
}

class Dvd(val nameDvd:String) : Category{
	override val name:String
	get(){
		return nameDvd
	}
}

class Decoder(val nameDecoder:String) : Category{
	
	override val name:String = nameDecoder.toUpperCase()
}

fun main(args: Array<String>) {
	
	val tv = Tv("Samsung")

	println(tv.name+" -- "+tv.type)
	
	val dvd = Dvd("LG")
	
	println(dvd.name+" -- "+dvd.type)
	
	val decoder = Decoder("Decodificador")
	
	println(decoder.name+" -- "+decoder.type)
}