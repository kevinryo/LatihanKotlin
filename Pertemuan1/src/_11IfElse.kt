fun main(args: Array<String>) {
    print("Masukkan Nilai : ")
    var nilai = readLine()!!.toDouble()

    if(nilai>=80){
        println("Selamat!! Kamu dapat nilai A")
    }else{
        println("Waw!! Kamu belum dapat nilai A")
    }
    println("Hmm!! Kamu memasukkan nilai $nilai")
}