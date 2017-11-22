open class Pesawat1{
    val sayap:Int = 4

    open fun terbang(){
        println("Terbang...")
    }

    fun mendarat(){
        println("Mendarat...")
    }
}

class PesawatTempur1: Pesawat1(){
    var rudal:Int = 4

    fun manuver(){
        println("Manuver...")
    }

    override fun terbang(){
        println("Terbang ala tempur...")
    }
}

fun main(args: Array<String>) {
    var boeing = Pesawat1()
    var f16 = PesawatTempur1()

    boeing.terbang()
    f16.terbang()

    boeing.mendarat()
    f16.mendarat()

    //boeing.manuver -->ERROR
    f16.manuver()
}