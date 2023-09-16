fun main() {
//    for (i in 1..5 step 2){
//        println(i)
//    }
//    println()
//    for (i in 1 until 5){
//        println(i)
//    }
//
//    println()
//    for (i in 10 downTo 1){
//        println(i)
//    }

//    Program of 5 multiplication table

    var num = 5
    for (i in 1..10)
//        println(num.toString() + " * " + i + " = " + num * i)
//        String templating
        println("$num * $i = ${num * i}")
}
