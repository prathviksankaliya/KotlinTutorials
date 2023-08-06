fun main() {

//    var animal = "cat"
//
//    when(animal){
//        "cat" -> println("Animal is Cat")
//        "horse" -> println("Animal is Horse")
//        "dog" -> println("Animal is Dog")
//        "cow" -> println("Animal is Cow")
//        else -> print("Animal Not Found")
//    }

//    var animal = "cat"
//    var result = when(animal){
//        "cat" -> "Animal is Cat"
//        "horse" -> "Animal is Horse"
//        "dog" -> "Animal is Dog"
//        "cow" -> "Animal is Cow"
//        else -> "Animal Not Found"
//    }
//    println(result)

    var num = 130;

    val result = when (num){
        11 -> "Eleven"
        12 -> "Twelve"
        in 13..19 -> "Teen"
        20 -> "tweenty"
        else -> "Not Found"
    }
    println(result)



}