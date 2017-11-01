fun main(args: Array<String>) {
    print("Masukkan Nilai Anda : ")
    var nilai = readLine()!!.toInt()

    when(nilai){
        100 -> println("Selamat!! Kamu dapat nilai SEMPURNA")
        98,99 -> println("Waww!! Kamu nyaris dapat nilai SEMPURNA")
        in 95..98 -> println("Joss!! Kamu dapat nilai A+")
        in 90..94 -> println("Joss!! Kamu dapat nilai A-")
        in 80..89 -> println("Wah Wah!! Kamu dapat nilai B")
        in 70..79 -> println("Semangat!! Kamu dapat nilai C")
        in 0..69 -> println("Maaf!! Kamu tidak lulus")
        !in 0..100 -> println("Hmmm!! Maafe diluar range nilai")
    }
}