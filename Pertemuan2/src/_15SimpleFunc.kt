fun display(n:Int = 0):Unit{
    println("n:$n")
}

fun displayNoInput():Unit{
    println("Selamat Datang Welcome")
}

fun main(args: Array<String>) {
    display(12)
    display()
    displayNoInput()
}