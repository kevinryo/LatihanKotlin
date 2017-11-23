import java.io.FileWriter
import java.io.FileReader

fun main(args: Array<String>) {
    readFile()
}

fun wroteFile(str: String){
    try {
        var wf = FileWriter("src/test.txt",true)
        wf.write(str)
        wf.close()
    }
    catch (err: Exception){
        println(err.message)
    }
}

fun readFile(){
    try {
        var fin = FileReader("src/test.txt")
        var c:Int
        do{
            c = fin.read()
            print(c.toChar())
        }while(c!=-1)
    }
    catch (err: Exception){
        println(err.message)
    }
}