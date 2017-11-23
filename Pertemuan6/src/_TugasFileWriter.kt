import java.io.FileWriter

fun main(args: Array<String>) {
    print("Masukkan teks : ")
    val teks = readLine()
    writerFile("$teks")
    println("Teks telah tersimpan di src/test.txt")
}

fun writerFile(str: String){
    try {
        var fw = FileWriter("src/test.txt")
        fw.write(str)
        fw.close()
    }
    catch (err: Exception){
        println(err.message)
    }
}
