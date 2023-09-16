fun main() {
    var c1 = AutoMobile("Alto 800", "Petrol");//secondary Constructor Called

    println(c1.maxSeating)
    println(c1.engineType)
    println(c1.tyres)

    var c2 = AutoMobile("XUV 500",6,15,"Petrol");//Primary Constructor Called
    println(c2.maxSeating)
    println(c2.engineType)
    println(c2.tyres)

}

//this is primary Constructor
class AutoMobile(val name: String, val tyres: Int,val maxSeating: Int,  val engineType: String){
    init{
        println("this is $name Car")
    }

//    Secondary Constructor
    constructor(nameParam: String, engineType: String):
        this(nameParam, 4, 5, engineType)
}