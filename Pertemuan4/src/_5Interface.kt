import Bonbin3.Companion.tees

// Interface - seluruh  method akan bersifat abstract, ditulis maupun tidak
interface Binatang3{
    fun makan()
    fun tidur()
}

class Kerbau3: Binatang3{
    override fun makan(){
        println("Kerbau makan...")
    }
    override fun tidur(){
        println("Kerbau tidur...")
    }
}

class Gajah3: Binatang3{
    override fun makan(){
        println("Gajah makan...")
    }
    override fun tidur(){
        println("Gajah tidur...")
    }

    fun duduk(){
        println("Gajah duduk...")
    }
}

class Bonbin3(){
    companion object {
        fun tees(x: Binatang3){
            x.makan()
            x.tidur()
        }
    }
}

fun main(args: Array<String>) {
    val g: Gajah3 = Gajah3()
    val k: Binatang3 = Kerbau3()

    tees(g)
    tees(k)
}