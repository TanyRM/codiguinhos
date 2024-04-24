package introducao.src.functions

// São declaradas usando a palavra chave fun
fun hello() { // Função sem retorno (tipo de retorno Unit, pode ser omitido
    return println("Hello, world!")
}

fun soma(x: Int, y: Int): Int { // fun nomeDaFunção(parametro1: tipo, parametro2: tipo): tipo_do_retorno {corpo da função}
    return x+y // Se a função não tiver retorno ou ele não for usavel pode ser omitido o tipo de retorno e o return
}

fun mensagemComPrefixo(mensagem: String, prefixo: String = "Info"){ // Valor default para parametro: parametro: tipo = default
    println("[$prefixo] $mensagem") // $ usado para acessar o valor do parametro, converter para String e concatenar
}

fun somaReduzida(a: Int, b: Int) = a + b // Função de expressão unica
fun main() {
    hello()
    println (soma(1,2))
    /* Chamada de função com argumentos nomeados,
    assim podem ser chamados em qualquer ordem */
    mensagemComPrefixo(prefixo = "Log", mensagem = "Hello")
    mensagemComPrefixo("Hello") // Se houver um valor default o parametro pode ser omitido no chamado
    println (somaReduzida(2,3))
}