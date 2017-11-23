import Kebonbon.Companion.tess

abstract class Binatang2(){
    abstract fun makan()
    abstract fun tidur()

    fun bernafas(){
        println("Bernafas...")
    }
}

abstract  class Gejeh: Binatang2(){
    //method makan tidak diimplementasikan

    override fun tidur(){
        println("Gajah tidur...")
    }
}

class Kerbe: Binatang2(){
    override fun makan(){
        println("Kerbe makan...")
    }
    override fun tidur(){
        println("Kerbe tidur...")
    }
}

class Kebonbon{
    companion object {
        fun tess(x: Binatang2){
            x.makan()
            x.tidur()
        }
    }
}

fun main(args: Array<String>) {
    //val g = Gejeh()
    val k = Kerbe()

    //tess(g)
    tess(k)
}