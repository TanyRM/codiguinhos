package introducao.src.basico

/* Intervalos para incremento são implementados usando o operador ..
   1..5 equivale a 1, 2, 3, 4, 5
   'a'..'d' equivalente a 'a', 'b', 'c', 'd'

   Para decrementar é usado downTo
   5 downTo 1 é equivalente a 5, 4, 3, 2, 1

   Para iterações que não são de um a um é usado o step após o intervalo
   1..5 step 2 é equivalente a 1, 3, 5

   Para intervalos que não incluem o valor final o operador usado é ..<
   1..<4 é equivalente a 1, 2, 3
 */

fun main(){

    for (number in 1..5){
        println(number)
    }

    val bolos = listOf("cenoura", "chocolate", "fubá")

    for (bolo in bolos){ // Loop em collections
        println("Esse bolo é de $bolo!")
    }

    var bolosComidos = 0
    var bolosProntos = 0

    while (bolosComidos < bolos.size){
        println("Comer bolo")
        bolosComidos++
    }

    do {
        println("Preparar bolo")
        bolosProntos++
    } while (bolosProntos < bolosComidos)
}