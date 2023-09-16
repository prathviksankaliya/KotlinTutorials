fun main() {
    var v1 = Person("prathvik", 22);
    println(v1.age)

    v1.age = 23
}

class Person(nameParam: String, ageParam: Int){

    var name: String = nameParam;
    // later initialization of variable
    //    lateinit var name: String = nameParam;
var age: Int = ageParam;


}