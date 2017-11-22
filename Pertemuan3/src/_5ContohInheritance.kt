open class Pesawat{
    val sayap:Int = 2

    fun terbang(){
        println("Terbang...")
    }

    fun mendarat(){
        println("Mendarat...")
    }
}

class PesawatTempur : Pesawat(){
    var rudal:Int = 4

    fun manuver(){
        println("Manuver...")
    }
}

fun main(args: Array<String>) {
    var boeing = Pesawat()
    var f16 = PesawatTempur()

    boeing.terbang()
    f16.terbang()

    boeing.mendarat()
    f16.mendarat()

    //boeing.manuver -->ERROR
    f16.manuver()

}