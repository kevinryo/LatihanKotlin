open class Pesawat3(val sayap:Int = 2){
    init {
        println("Object Pesawat Dibuat")
    }
    fun cetakSayap(){
        println("Sayap : "+sayap)
    }
}

class PesawatTempur3(val rudal:Int = 4) : Pesawat3(){
    init {
        println("Object Pesawat Tempur Dibuat")
        super.cetakSayap()
    }
}

fun main(args: Array<String>) {
    val f16 = PesawatTempur3()
}