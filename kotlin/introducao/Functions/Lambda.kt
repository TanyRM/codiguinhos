package introducao.Functions

// Kotlin permite o uso de expressões Lambda
/*fun uppercaseString(string: String): String{
    return string.uppercase()
}*/

fun main(){
    // println(uppercaseString("hello"))
    // Passando para Lambda
    val resultado: String = {string: String -> string.uppercase()}("hello") // {parametros -> corpo da função}
    resultado = { ("Mensagem") }
}