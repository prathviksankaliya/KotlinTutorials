fun main() {
    println(A.i)
    B.show()

//    object Expression (Anonymous)
    var test = object {
        var x = 10;
        fun testing() = println("Testing...")
    }
    test.testing()
}
//if you need only one object so use object keyword
//if you need multiple objects so use class
//constructor is not allowed but init is allowed
object A{
    var i = 10;
}

object B{
    var name = "Prathvik"

    fun show() = println("Hello Dude!!")
}