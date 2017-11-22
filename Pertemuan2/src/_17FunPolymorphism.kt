fun show(nama:String):Unit{
    println("Nama : "+nama)
}

fun show(number:Int):Unit{
    println("Number : "+number)
}

fun show(numberD:Double):Unit{
    println("NumberD : "+numberD)
}

fun main(args: Array<String>) {
    show("Ryoma")
    show(12.5)
}