fun main() {
    var mini = Car("Mini Cooper", "Petrol", 100);
    var bugati = Car("Bugati", "Disel", 300);

    println(mini.name)
    println(mini.type)
    println(mini.kmRun)
    mini.driveCar()
    mini.applyBreaks()
}

class Car(val name : String,val type: String,var kmRun: Int){
    fun driveCar(){
        println("$name Car is Driving...")
    }
    fun applyBreaks(){
        println("$name Applying Breaks..")
    }
}