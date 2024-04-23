package introducao.classes

fun main(){
    // Os parametros na header são usados no construtor default da classe
    val contato = Contato(1, "example@gmail.com")

    // Para acessar variaveis se usa o nome da propriedade depois do nome da instancia
    println(contato.id)
    contato.nome = "Maria da Silva"

    // Para concatenar o valor da propriedade na String
    println("O nome do contato é: ${contato.nome}")

    // Para chamar a função membro em uma instancia da classe
    contato.printId()

    // Data class
    val usuario1 = User("Maria da Silva", 1)
    println(usuario1) // Chama a função .toString()
    println(usuario1.toString())

    val usuario2 = User("Joao de Souza", 2)
    println(usuario1 == usuario2)
    println(usuario1.equals(usuario2))

    // Fazer uma copia exata de uma instancia
    val usuario3 = usuario1.copy()
    println(usuario3.toString())

    // Retorna o hash code
    println(usuario1.hashCode())

    // Retorna um dos elementos da instancia
    println(usuario1.component1())

    // As classes regulares também possuem esses metodos mas de forma diferente
    println(contato.toString())
}