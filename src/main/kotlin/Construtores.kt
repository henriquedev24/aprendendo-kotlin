
class Silvestre(var nome:String){
    var atk: Int? = 0
    constructor(nome: String, atk:Int) : this(nome){
        this.atk = atk
    }
    fun AP(){
        println("Meu animal silvestre é $nome e seu ataque é $atk")
    }
}

fun main(){
    val s1 = Silvestre("Águia")
    val s2 = Silvestre("Serpente")
    s1.AP()
    s2.AP()
}