fun main(args: Array<String>) {
    for(a in 1..5){
        for(b in a..4){
            print(" ")
        }
        for(c in 1..a){
            print("*")
        }
        println()
    }
}