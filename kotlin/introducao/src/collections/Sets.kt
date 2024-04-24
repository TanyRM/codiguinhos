package introducao.src.collections

// Sets: Coleções exclusivas de itens não ordenados

fun main(){
    // Sets não são ordenadas e permitem apenas elementos unicos
    val readyOnlySet = setOf(1, 2, 3, 4, 5) // Set de valor imutavel
    println(readyOnlySet) // O item duplicado aparece apenas uma vez

    val frutas: MutableSet<String> = mutableSetOf("maçã", "uva", "laranja", "uva") // Set mutavel com declaração de tipo explicita
    println(frutas)

    val numBloqueados: Set<String> = frutas

    // Em sets não se pode acessar itens pelo indice
    println("Esse set tem ${readyOnlySet.count()} frutas")

    println("banana" in frutas)

    frutas.add("banana")
    frutas.remove("uva")
    println(frutas)

    println(frutas.size)
}