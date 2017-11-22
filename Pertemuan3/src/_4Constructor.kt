/*class mobil4(mesin: Int, roda: Int, bodi: Int){
    init {
        println("Mesin: $mesin, Roda: $roda, Bodi: $bodi")
    }

    val mesinMobil = mesin
    val rodaMobil = roda
    val bodiMobil = bodi
}*/

//Primary Constructor
class mobil4(val mesin: Int, val roda: Int, val bodi: Int){
    init {
        println("Mesin: $mesin, Roda: $roda, Bodi: $bodi")
    }
}

//Secondary Constructor
class mobil5(val mesin: Int){
    constructor(roda: Int, bodi: Int):this(1){
        println("Dicetak dari secondary constructor")
        println("Mesin: ${this.mesin}, Roda: $roda, Bodi: $bodi")
    }
}

fun main(args: Array<String>) {
    var avanza = mobil4(1,4,1)
    println("Jumlah bodi : "+avanza.bodi)

    println("----------------------------------")
    var xenia = mobil5(12,2)
    //println(xenia)
}