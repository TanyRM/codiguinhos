package introducao.src.basico

// if e when
// é recomendado usar when para programas mais robustos e seguros

fun main(){
    val check = true
    val d: Int

    // if (condição) {ação}
    if (check) {
        d = 1
    } else {
        d = 2
    }

    println(d)

    // não existe operador ternario em kotlin
    val a = 1
    val b = 2

    println(if (a > b) a else b) // if usado como expressão sem {}

    // when usado quando se tem muitas opções, pode ser usado com declaração ou expressão
    val obj = "hello"
    when (obj){
        // Verifica qual opção é igual a obj
        "1" -> println("Um") // -> separa a condição da ação

        "hello" -> {
            println("Olá")
        }

        else -> println("Inválido") // Default
    }
    /* when com expressão
    val obj = "Hello"

    val result = when (obj) {
        // If obj equals "1", sets result to "one"
        "1" -> "One"
        // If obj equals "Hello", sets result to "Greeting"
        "Hello" -> "Greeting"
        // Sets result to "Unknown" if no previous condition is satisfied
        else -> "Unknown"
    }
    println(result)
     */
}