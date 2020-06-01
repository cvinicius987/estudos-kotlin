package cap11.extension_members

class Content<T>(val item:T)

sealed class Forma(){

    //Os metodos de extens�o membros est�o disponiveis somente no escopo
    //da Classe e no escopo das classes filhas
    //Eles n�op podem ser chamados fora do escopo

    fun Content<String>.showAsString() = "Item: $item, � String"

    fun Content<Int>.showAsInt() = "Item: $item, � Int"
}

class FormaImpl(val strContent:Content<String>,
                val strInt:Content<Int>,
                val strDouble:Content<Double>) : Forma(){

    /**
     * Somente os Content<String> e Content<Int> ter�o os metodos listados na class Forma
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