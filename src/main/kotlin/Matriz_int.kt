fun main() {
    val linhas = 4
    val colunas = 6
    val matriz: Array<Array<Int>> = Array(linhas) {Array(colunas) {0} }
    var digito = -1
    for( i in 0 until linhas){
        for(j in 0 until colunas){
            print("${matriz[i][j]} ")
        }
        println()
    }
    for(i in 0 until linhas){
        for(j in 0 until colunas){
            matriz[i][j] = digito++
        }
    }
    println("Impressão da matriz: ")
    for(linha in matriz){
        for(valor in linha){
            print("${valor} ")
        }
        println()
    }
    println("Quant. linhas: ${matriz.size}")
    println("Quant. colunas: ${matriz[0].size}")
}