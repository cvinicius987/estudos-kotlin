package cap11.extension_members

class Content<T>(val item:T)

sealed class Forma(){

    //Os metodos de extensão membros estão disponiveis somente no escopo
    //da Classe e no escopo das classes filhas
    //Eles nãop podem ser chamados fora do escopo

    fun Content<String>.showAsString() = "Item: $item, é String"

    fun Content<Int>.showAsInt() = "Item: $item, é Int"
}

class FormaImpl(val strContent:Content<String>,
                val strInt:Content<Int>,
                val strDouble:Content<Double>) : Forma(){

    /**
     * Somente os Content<String> e Content<Int> terão os metodos listados na class Forma
     */
    override fun toString(): String {
        return """
                ${strContent.showAsString()}
                ${strInt.showAsInt()}
                """
    }
}

fun main() {

    val forma:FormaImpl = FormaImpl(Content("Kotlin"), Content(10), Content(12.5))

    println(forma)
}