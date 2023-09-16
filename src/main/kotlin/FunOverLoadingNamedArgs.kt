import javax.print.attribute.standard.DocumentName
import kotlin.math.pow

fun main() {
    println(addition(10, 20))
    println(add(10.2 , 10.2))
    println(add(b = 10.2 , a = 10.2))// Named Argument

    var fn = { a: Double, b: Double -> add(a, b) }
    println(fn(10.5, 10.5))// Function stored in variable

    fn = ::power
    println(fn(2.0, 3.0))
}
//this all files in same package so use functions in any files
fun add(a: Double, b: Double) : Double{
    return a+b
}

fun power(a: Double, b: Double): Double{
    return a.pow(b)
}
