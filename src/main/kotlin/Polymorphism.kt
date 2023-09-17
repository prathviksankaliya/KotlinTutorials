import java.nio.DoubleBuffer

fun main() {
//    var circle = Circle(4.0);
//    var square = Square(4.0);

    var circle : Shape = Circle(4.0);
    var square : Shape = Square(4.0);

    println(circle.area())
    println(square.area())
}

open class Shape{
    open fun area(): Double{
        return 0.0
    }
}

class Circle(var radius: Double): Shape(){
    override fun area(): Double {
        return Math.PI * radius * radius;
    }
}

class Square(var side: Double): Shape(){
    override fun area(): Double {
        return side * side
    }
}