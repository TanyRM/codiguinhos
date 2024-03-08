package introducao.collections

// Lists: Coleções ordenadas de itens

fun main() {
    // Listas ordenam na ordem adicionada e permitem itens duplicados
    val readOnlyList = listOf("circulo", "quadrado", "triangulo") // O valor não pode ser modificado
    println(readOnlyList)

    val listComTipo = listOf<Int>(1, 2, 3, 4, 5) // Declarar o tipo de elementos presentes na lista com <>
    println(listComTipo)

    val listMutavel = mutableListOf(5, 4, 3, 2, 1) // Lista com valores mutáveis
    println(listMutavel)

    val formas: MutableList<String> = mutableListOf("triangulo", "quadrado", "circulo") // Lista mutavel com declaração de tipo explicita
    println(formas)

    val formasFixas: List<String> = formas // para proteger de modificações pode-se fazer o casting para ready Only usando List

    println("O primeiro item da lista é: ${readOnlyList[0]}") // para exibir o elemento da lista é preciso usar o indice

    println("Primeiro item: ${readOnlyList.first()}") // Retorna o primeiro elemento de uma lista

    println("Ultimo numero: ${listComTipo.last()}") // Retorna o ultimo elemento de uma lista

    println("Quantidade de elementos na lista: ${readOnlyList.count()}") // Conta os elementos da lista

    println("quadrado" in readOnlyList) // Verifica se o elemento está na lista

    listMutavel.add(0) // Adiciona elementos a uma lista mutavel
    listMutavel.remove(3) // Remove um elemento de uma lista mutável
    println(listMutavel)

}