class mobil3{
    companion object {
        @JvmField var pintu = 2

        fun bukapintu(){
            println("Buka pintu...")
        }
    }

    var mesin = 1
    var roda = 4
    var bodi = 1
}

fun main(args: Array<String>) {
    var avanza = mobil3()
    println("Mesin avanza : "+avanza.mesin)
    println("Jumlah Pintu : "+mobil3.pintu)
    mobil3.bukapintu()
}