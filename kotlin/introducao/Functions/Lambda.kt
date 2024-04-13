package introducao.Functions

// Kotlin permite o uso de expressões Lambda
/*fun uppercaseString(string: String): String{
    return string.uppercase()
}*/
fun toSegundos(tempo: String): (Int) -> Int = when (tempo){
    "horas" -> { valor -> valor*60*60}
    "minutos" -> {valor -> valor*60}
    "segundos" -> {valor -> valor}
    else -> {valor -> valor}
}
fun main(){
    // println(uppercaseString("hello"))
    // Passando para Lambda
    var resultado: String = {string: String -> string.uppercase()}("hello") // {parametros -> corpo da função} pode ser invocada chamando os parametros depois
    val upperCase: (String) -> String = { string -> string.uppercase()} // (Tipo do retorno) -> nome {parametros -> corpo da função}
    // Se não houver parametros os parenteses ficam vazios. Ex: () -> Unit

    // Usos para funções Lambda
    val upperCaseString = { string: String -> string.uppercase() } // Atribuir a uma variavel
    println(upperCaseString("hello"))

    val numeros = listOf(1, -2, 3, -4, 5)
    val positivos = numeros.filter { x -> x>0 } // Usar como parametro em outra função
    println(positivos)

    val tempoMinutos = listOf(2, 10, 15, 1)
    val minutosToSegundos = toSegundos("minuto")
    val totalTempoEmSegundos = tempoMinutos.map(minutosToSegundos).sum() // Usar como retorno de uma função
    println("O tempo total em segundos é $totalTempoEmSegundos segundos")

    /* Trailing Lambdas
        Se a expressão for o ultimo parametro, ela pode ser passada dentro ou fora dos parenteses de parametros
     */
    println(listOf(1, 2, 3).fold(0, { x, item -> x + item }))
    println(listOf(1, 2, 3).fold(0) { x, item -> x + item })
}