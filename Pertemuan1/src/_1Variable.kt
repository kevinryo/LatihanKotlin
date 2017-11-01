fun main(args: Array<String>) {
    var name = "Ryoma"                  //tanpa inisiasi type data
    var age:Int = 21                    //inisiasi type data
    var departement:String?             //variable boleh null
    departement = "Information Technology"

    println("Nama : "+name)
    println("Age  : "+age)
    println("Departement  : $departement")

    val pi:Double = 3.14
    //var pi:Double = 3.143             //tidak bisa dijalankan karena pi (konstan)

    println("Nilai Phi : "+pi)
}