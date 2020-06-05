package cap11.dsl

/**
 * A fun��o alert recebe 2 parametros mais a lambda com receptor de AlertDialogBuilder
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

    //Chama a fun��o alert passando uma fun��o de DialogInterface
    //Dentro da fun��o temos a acesso ao this de DialogInterface
    //e podemos chamar as fun��es positive e negative
    alert(title="Are you sure?", message = "Are you relly sure ?", teste=AlertDialogBuilder()) {

        //Chamada da fun��o positive onde o ultimo paramentro � uma lambda de DialogInterface
        //Dentro da lambda temos acesso ao this de DialogInterface
        //e podemos chamar fun��es externas como a process()
        positive("Yes") {
            process()
        }

        //Chamada da fun��o positive onde o ultimo paramentro � uma lambda de DialogInterface
        //Dentro da lambda temos acesso ao this de DialogInterface
        negative("No") {
            cancel()
        }
    }

}

fun main() {

    show({ println("Executando o processo.................")})
}