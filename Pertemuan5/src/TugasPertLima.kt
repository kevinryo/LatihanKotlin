class Hitung(val angka:Double, val angka2: Double){
    var hasil = 0.0

    fun penjumlahan(){
        hasil = angka + angka2
        println("Hasil Penjumlahan : $hasil")
    }

    fun pengurangan(){
        hasil = angka - angka2
        println("Hasil Pengurangan : $hasil")
    }

    fun pembagian(){
        try {
            hasil = angka / angka2
            println("Hasil Pembagian : $hasil")
        }
        catch (err: Exception){
            println(err.message)
        }
    }

    fun perkalian(): Double{
        hasil = angka * angka2
        println("Hasil Perkalian : $hasil")
        return hasil
    }
}

fun main(args: Array<String>) {
    do {
        println("Pilih Operasi:")
        println("1. Penjumlahan")
        println("2. Pengurangan")
        println("3. Pembagian")
        println("4. Perkalian")
        println("5. Keluar")
        print("Masukkan Operasi: ")
        val op = readLine()!!.toInt()
        if(op<5) {
            print("Masukkan Angka Pertama: ")
            val n1 = readLine()!!.toDouble()
            print("Masukkan Angka Kedua: ")
            val n2 = readLine()!!.toDouble()

            val hitung = Hitung(n1, n2)
            when (op) {
                1 -> hitung.penjumlahan()
                2 -> hitung.pengurangan()
                3 -> hitung.pembagian()
                4 -> hitung.perkalian()
            }
        }else if(op==5){
            println("Terima Kasih")
            System.exit(0)
        }else{
            println("silahkan ulangi kembali")
        }
    }while(true)
}