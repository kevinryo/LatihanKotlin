fun main(args: Array<String>) {
    var arrayInt = Array<Int>(5){0}
    arrayInt[3] = 55
    println("Array[3] = "+arrayInt[3])

    println("-----------------------")
    println("All Element By Object")
    for(element in arrayInt){
        println(element)
    }

    println("-----------------------")
    println("All Element By Index")
    for(index in 0..4){
        println(arrayInt[index])
    }

    println("=======================")
    var arrayStr = Array<String>(4){""}
    for(indek in 0..3){
        print("arrayStr[$indek] = ")
        arrayStr[indek] = readLine()!!
    }
    println("----------------------")
    for(indek in 0..3){
        println("arrayStr[$indek] = "+arrayStr[indek])
    }
}