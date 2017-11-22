fun main(args: Array<String>) {
    //hashMapOf
    var map = hashMapOf("nama_depan" to "Muhammad", "nama_tengah" to "Kevin")
    map.put("nama_belakang","Ryoma")
    println(map.get("nama_belakang"))
    println(map["nama_belakang"])

    println("-------------------------")

    //ArrayOf
    var ar = arrayOf(1,10,22,11)
    println(ar[0])
    for(ind in ar){
        println(ind)
    }

    println("------------------------")

    //MutableOf
    var list = mutableListOf(11,22,33,22)
    list[0] = 22
    for(item in list){
        println(item)
    }


}