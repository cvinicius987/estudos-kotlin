package cap11.dsl

/**
 * A função alert recebe 2 parametros mais a lambda com receptor de AlertDialogBuilder
 */
fun alert(message:String, title:String, teste:AlertDialogBuilder, init: AlertDialogBuilder.() -> Unit) {

    println("$title - $message")

    teste.init()
}

/**
 * Classe possui 2 metodos que podem ser utilziados dentro do seu escopo
 */
class AlertDialogBuilder {

    fun positive(text:String, callback: DialogInterface.() -> Unit){
        println(text)
    }

    fun negative(text:String, callback: DialogInterface.() -> Unit){
        println(text)
    }
}

class DialogInterface{
    fun cancel() {
        println("Cancelada...")
    }
}

fun show(process:() -> Unit){

    //Chama a função alert passando uma função de DialogInterface
    //Dentro da função temos a acesso ao this de DialogInterface
    //e podemos chamar as funções positive e negative
    alert(title="Are you sure?", message = "Are you relly sure ?", teste=AlertDialogBuilder()) {

        //Chamada da função positive onde o ultimo paramentro é uma lambda de DialogInterface
        //Dentro da lambda temos acesso ao this de DialogInterface
        //e podemos chamar funções externas como a process()
        positive("Yes") {
            process()
        }

        //Chamada da função positive onde o ultimo paramentro é uma lambda de DialogInterface
        //Dentro da lambda temos acesso ao this de DialogInterface
        negative("No") {
            cancel()
        }
    }

}

fun main() {

    show({ println("Executando o processo.................")})
}