import java.util.*

fun main(args: Array<String>) {

    //input
    print("Enter your DOB : ")
    var DOB:Int = readLine()!!.toInt()

    //proses
    var year = Calendar.getInstance().get(Calendar.YEAR)
    var age:Int?
    age = year-DOB

    //output
    println("Your Age Is $age Years")

}