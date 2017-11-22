fun main(args: Array<String>) {
    var arraylist = ArrayList<String>()

    //insert
    arraylist.add("Muhammad")
    arraylist.add("Kevin")
    arraylist.add("Ryoma")
    arraylist.add("Batealit")

    //access
    println("First Name : "+arraylist.get(0))
    println("===============================")

    println("All element by object")
    for(element in arraylist){
        println(element)
    }

    //update
    arraylist.set(3,"Unisnu Jepara")

    println("--------------------------------")
    println("All element by index")
    for(index in 0..arraylist.size-1){
        println(arraylist.get(index))
    }

    println("--------------------------------")
    //search
    if(arraylist.contains("Hussein")){
        println("Name is found")
    }else{
        println("Name is not found")
    }
}