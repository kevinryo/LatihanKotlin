//Materi Encapsulation

class mobil{
    //field atau atribut
    var mesin = 1
    var roda = 4
    var bodi = 1

    //method
    fun maju(){
        println("Mobil maju...")
    }

    fun mundur(){
        println("Mobil mundur...")
    }

    fun belok(){
        println("Mobil belok...")
    }
}

fun main(args: Array<String>) {
    var avanza = mobil()
    avanza.maju()
    avanza.mundur()
    avanza.belok()
    println("----------------")
    println("Mesin : "+avanza.mesin)
    println("Roda : "+avanza.roda)
    println("Bodi : "+avanza.bodi)
}