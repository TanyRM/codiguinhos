package introducao.src.classes

/* As propriedades podem ser declaradas depois do nome entre parenteses
   ou no corpo da classe.
   As propriedades definidas entre parenteses são chamadas de class header
 */
class Contato (val id: Int, var email: String = "example@gmail.com"){
    var nome: String = ""
    var telefone: String = ""

    // Funções membros (semelhante a metodos)
    fun printId(){
        println(id)
    }

}
// Continuar de Member functions