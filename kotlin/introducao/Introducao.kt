package introducao

val topLevel = 0 // Variavel declarada em nivel superior
const val valor = 10 // Declarar constante
fun main() {

    // A variavel só pode ficar sem ser inicializada se não for usada no código
    val num = 1 // Val o valor não pode ser modificado
    var tam = 1 // Var usado para valor mutável
    val tipo: String // Var ou Val deve conter o valor ou o tipo

    //num = 2
    tam = 6 + topLevel
    println(tam)
    tipo = "O tipo da variavel é String"
    println(tipo)

    println("Hello, world!")
    println(message = true)
    println(tam + valor)

    val grupos = 10
    println("Existem $grupos grupos") // Para usar uma variavel $
    println("Existem ${grupos + 1} grupos") // Para realizar uma expressão ${}

}