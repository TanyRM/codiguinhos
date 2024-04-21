package introducao.classes

/* As propriedades podem ser declaradas depois do nome entre parenteses
   ou no corpo da classe.
   As propriedades definidas entre parenteses são chamadas de class header
 */
class Contato (val id: Int, var email: String = "example@gmail.com"){
    var nome: String = ""
    var telefone: String = ""

    fun main(){
        // Os parametros na header são usados no construtor default da classe
        val contato = Contato(1, "example@gmail.com")

        // Para acessar variaveis se usa o nome da propriedade depois do nome da instancia
        println(contato.id)
        contato.nome = "Maria da Silva"

        // Para concatenar o valor da propriedade na String
        println("O nome do contato é: ${contato.nome}")
    }

}
// Continuar de Member functions