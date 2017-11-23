import java.io.FileReader
import java.io.FileWriter

fun main(args: Array<String>) {
    do {
        println()
        println("Program Read-Write")
        println("Pilih salah satu action dibawah:")
        println("1. Write File")
        println("2. Read File")
        println("3. Keluar")
        print("Pilih: ")
        val pil = readLine()!!.toInt()
        if (pil == 1) {
            print("Masukkan teks : ")
            val teks = readLine()
            writeaFile("$teks")
            println("Teks telah tersimpan di src/test.txt")
        } else if (pil == 2) {
            print("Teks yang terbaca : ")
            readaFile()
            println()
        } else if (pil == 3) {
            println("Terima kasih telah menggunakan program ini")
            System.exit(0)
        }
    }while (true)
}

fun writeaFile(str: String){
    try {
        val wrt = FileWriter("src/test.txt")
        wrt.write(str)
        wrt.close()
    }
    catch (err: Exception){
        println(err.message)
    }
}

fun readaFile(){
    try {
        var rea = FileReader("src/test.txt")
        var c:Int
        do{
            c = rea.read()
            print(c.toChar())
        }while(c!=-1)
    }
    catch (err: Exception){
        println(err.message)
    }
}