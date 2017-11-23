import Bonbin.Companion.test

class Gajah{
    fun makan(){
        println("Gajah Makan...")
    }
    fun tidur(){
        println("Gajah Tidur...")
    }
}

class Kerbau{
    fun makan(){
        println("Kerbau Makan...")
    }
    fun tidur(){
        println("Kerbau Tidur...")
    }
}

class Bonbin{
    companion object {
        fun test(x: Gajah){
            x.makan()
            x.tidur()
        }
        fun test(x: Kerbau){
            x.makan()
            x.tidur()
        }
    }
}

fun main(args: Array<String>) {
    val g = Gajah()
    val k = Kerbau()

    test(g)
    test(k)
}