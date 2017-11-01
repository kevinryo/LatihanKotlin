fun main(args: Array<String>) {
    print("Masukkan Nilai : ")
    var nilai = readLine()!!.toDouble()

    if(nilai>=90){
        println("Selamat!! Kamu dapat nilai A")
    }
    println("Hmmm!! Kamu memasukkan nilai $nilai")

}