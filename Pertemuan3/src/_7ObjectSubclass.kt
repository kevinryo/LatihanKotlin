open class Pesawat2(val sayap:Int = 2){
    init {
        println("Object Pesawat dibuat....")
    }
}

class PesawatTempur2(val rudal:Int = 4) : Pesawat2(){
    init {
        println("Object Pesawat Tempur dibuat...")
    }
}

fun main(args: Array<String>) {
    val f16 = PesawatTempur2()
    //print(f16)
}