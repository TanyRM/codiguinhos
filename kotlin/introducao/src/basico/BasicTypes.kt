package introducao.src.basico

fun main() {
    var valor = 10 // Inferencia de tipo para permitir operações

    valor = valor +3
    println(valor)
    valor += 7
    println(valor)
    valor -= 3
    println(valor)
    valor *= 2
    println(valor)
    valor /= 2
    println(valor)
    valor %= 3
    println(valor)

    /* os tipos básicos de kotlin são:
    Integers - Byte, Short, Int, Long
    Unsigned integers - UByte, UShort, UInt, ULong
    Floating point - Float, Double
    Booleans - Bolean
    Characters - Char
    Strings - String
     */
}

fun Tipos() {
    // Exemplos
    val a: Int = 1000
    val b: String = "log message"
    val c: Double = 3.14
    val d: Long = 100_000_000_000_000
    val e: Boolean = false
    val f: Char = '\n'
}