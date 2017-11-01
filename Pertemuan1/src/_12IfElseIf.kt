fun main(args: Array<String>) {
    print("Masukkan Nilai : ")
    var nilai = readLine()!!.toDouble()

    if(nilai>=90){
        println("Waw!! Kamu dapat nilai A")
    }else if(nilai>=80 && nilai<90){
        println("Waw!! Kamu dapat nilai B")
    }else if(nilai>=70 && nilai<80){
        println("Waw!! Kamu dapat nilai C")
    }else{
        println("Maaf!! Kamu belum lulus")
    }
    println("")
    println("Hmm!! Kamu memasukkan nilai $nilai")
}