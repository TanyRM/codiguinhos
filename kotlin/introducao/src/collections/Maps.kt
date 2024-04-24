package introducao.src.collections

// Maps: Conjuntos de pares de valores-chave em que as chaves são exclusivas e mapeadas para apenas um valor
fun main(){
    /* Map armazena os itens como pares de valores, o valor é acessado referenciando a chave
    - são uteis para procurar valores sem usar indice numerado
    - permite valores duplicados
     */

    val readOnlyMenu = mapOf("maçã" to 5, "uva" to 20, "banana" to 5) // Map com valores imutaveis
    println(readOnlyMenu)

    val sucoMenu: MutableMap<String, Int> = mutableMapOf("uva" to 5, "maçã" to 10, "laranja" to 5) // Map mutavel com declaração explicita de tipos <chave, valor>
    println(sucoMenu)

    val sucosBloqueado: Map<String, Int> = sucoMenu

    println("O valor da uva é ${readOnlyMenu["uva"]}") // Para retornar o valor se usa a chave como indice

    println("Esse mapa tem ${readOnlyMenu.count()} opções")

    sucoMenu.put("caju", 5) // Pode-se adicionar valores usando .put(chave, valor)
    sucoMenu["acerola"] = 10 // Ou, passando a chave e inicializando o valor em seguida
    println(sucoMenu)

    sucoMenu.remove("maçã") // Para remover se usa o .remove(chave)
    println(sucoMenu)

    println(readOnlyMenu.containsKey("uva")) // Para verificar se uma chave está no mapa
    println("uva" in readOnlyMenu) // ou println("uva" in readOnlyMenu.keys)
    println(10 in readOnlyMenu.values) // Verifica se um valor está no mapa

    println(readOnlyMenu.keys) // Retorna uma lista das chaves do mapa
    println(readOnlyMenu.values) // Retorna uma lista com os valores do mapa
}