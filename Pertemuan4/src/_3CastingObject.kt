open class Binatang1(){
    open fun makan(){
        println("makan...")
    }
    open fun tidur(){
        println("tidur...")
    }
}

class Gejah: Binatang(){
    override fun makan(){
        println("Gejah makan...")
    }
    override fun tidur(){
        println("Gejah tidur...")
    }

    fun duduk(){
        println("Gejah duduk...")
    }
}

fun main(args: Array<String>) {
    val g: Binatang = Gejah()
    g.makan()
    g.tidur()
    //g.duduk()
    (g as Gejah).duduk() //object di casting


}