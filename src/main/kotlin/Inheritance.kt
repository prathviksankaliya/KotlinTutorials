fun main() {
    var c1 = Child();
    c1.show()
    c1.display()
}

//open means public anyone can inherit this class
//can't inherit multiple classes same like java
open class parent{
    var name: String = ""

    init{
        println("Parent Constructor..")
    }
    fun show(){
        println("I am Parent class")
    }
}

class Child : parent(){
    var name2 = ""

    init{
        println("Child Constructor..")
    }
    fun display(){
        println("This is child Method!!")
    }
}