fun main(args: Array<String>) {
    print("Input Your Name : ")
    var name = readLine()
    print("Input Your Age : ")
    var age:Int = readLine()!!.toInt()
    print("Input Your Departement : ")
    var departement:String?
    departement = readLine()
    println("===============================")
    println("My Name is : $name")
    println("My Age : "+ age)
    println("I now in : "+ departement)
}