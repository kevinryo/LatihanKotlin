import Kebonbin.Companion.tes

open class  Binatang(){
    open fun makan(){
        println("makan...")
    }
    open fun tidur(){
        println("tidur...")
    }
}

class Gajeh: Binatang(){
    override fun makan(){
        println("Gajah makan...")
    }
    override fun tidur(){
        println("Gajah tidur...")
    }
}

class Kerbo: Binatang(){
    override fun makan(){
        println("Kerbau makan...")
    }
    override fun tidur(){
        println("Kerbau tidur...")
    }
}

class Kebonbin(){
    companion object {
        fun tes(x: Binatang){
            x.makan()
            x.tidur()
        }
    }
}

fun main(args: Array<String>) {
    /*val g: Binatang = Gajeh()
    val k: Binatang = Kerbo()*/

    val bin: List<Binatang> = listOf(Gajeh(),Kerbo())

    /*tes(g)
    tes(k)*/

    tes(bin[0])
    println("-----------------------")
    tes(bin[1])
}