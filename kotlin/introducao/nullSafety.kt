package introducao

/*
    Kotlin suporta valores nulos
    atraves da adição de ? após a declaração de tipo
    Por default o nulo não é aceito
 */
fun main(args: Array<String>){

    var nuncaNulo: String = "Não pode ser nulo"
    // nuncaNulo = null

    var nulo: String? = "Pode ter valor nulo"
    nulo = null
    println(nulo)

    var naoDefinido = "Por default, não aceita nulo"
    // naoDefinido = null

    fun strLength(naoNulo: String): Int{
        return naoNulo.length
    }

    println(strLength(nuncaNulo))
    println(nulo)

    fun lengthString(talvezNulo: String?): Int? = talvezNulo?.length

    // Chamada segura para retornar o valor ou nulo
    fun safeCall(){
        var stringNula: String? = null
        println(lengthString(stringNula))
    }

    /*
        Funciona como um if:
        Do lado esquerdo do operador ?: o que acontece se for nulo
        Do lado direito do operador ?: o que acontece se não for
     */
    fun elvisOperator(){
        var stringNula: String? = null
        println(stringNula?.length ?: 0)
    }
}
