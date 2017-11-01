fun main(args: Array<String>) {
    //Continue
    for(count in 1..5){
        if(count==4)
            continue
        println("count : $count")
    }

    println()
    println()

    //Break
    for(bre in 1..5){
        if(bre==4)
            break
        println("bre : $bre")
    }
}