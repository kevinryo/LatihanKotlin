class mobil2{
    var mesin = 1
    var roda = 4
    var bodi = 1
}

fun main(args: Array<String>) {
    var avanza = mobil2()
    var truk = mobil2()

    println("Roda avanza : "+avanza.roda)
    println("Roda truk : "+truk.roda)
    truk.roda = 6
    println("Roda avanza : "+avanza.roda)
    println("Roda truk baru : "+truk.roda)

    println("---------------------------------")

    println("Mesin avanza : "+avanza.mesin)
    println("Mesin truk : "+truk.mesin)
    avanza.mesin = 3
    println("Mesin avanza baru : "+avanza.mesin)
    println("Mesin truk : "+truk.mesin)

}