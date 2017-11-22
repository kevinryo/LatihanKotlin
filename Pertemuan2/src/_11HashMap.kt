fun main(args: Array<String>) {
    var map = HashMap<Int,String>()
    map.put(1,"Ahmad")
    map.put(22,"Muhammad")
    map.put(333,"Mahmud")
    println(map.get(333))
    println("---------------")

    map.put(333,"Kevin Ryoma")
    for(k in map.keys){
        println(map.get(k))
    }
}