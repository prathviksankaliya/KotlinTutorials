fun main() {
    println(addition(5, 10))
    println(checkNumberIsEven(11))
    printMessage(4)
    println()
    printMessage()
}

//fun addition(num1: Int, num2: Int):Int{
//    return num1 + num2;
//}

//fun addition(num1: Int, num2: Int): Int = num1 + num2;
fun addition(num1: Int, num2: Int) = num1 + num2;

//default return type is unit for function
fun checkNumberIsEven(num1: Int):Boolean{
    return if(num1 % 2 == 0) true else false
}

fun printMessage(count : Int = 2){// default variables are always *val* so it's can't modify it.
    for (i in 1..count)
        println("Hello: $i")
}