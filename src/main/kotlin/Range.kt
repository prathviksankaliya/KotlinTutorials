fun main() {

    var num = 5;

//    val result = num in 1..5; // .. means its valid for 1, 2, 3, 4, 5.
//    println(result) // true

    val result = num in 1 until 5; // until means its valid for 1, 2, 3, 4.
    println(result) // false
}