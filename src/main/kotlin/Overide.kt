fun main() {
    var o1 = OnePlus();
    o1.powerOff();
}
//in kotlin always have one super class called **Any**
open class Mobile(){
    var name = ""
    var size = 5

    fun makeCall() = println("Calling from Mobile..")
    open fun powerOff() = println("Mobile is Power Off....")
    //open means this method for override in Child...
}

class OnePlus: Mobile(){
    override fun powerOff() = println("One Plus Mobile is Power Off...")
}