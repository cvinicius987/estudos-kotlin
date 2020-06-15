package cap2.inheritance

open class Template(open val name:String)

class Final(override val name:String) : Template(name)