fun main() {

    var gender : String? = null //? (Nullable Type)means this accept as null or value both

    println(gender?.uppercase()) // at the time of perform operation at that time check is null or not.

    gender?.let {
        // in this block no require to check null or not cause in top already check.
        println("Line 1")
        println("Line 2 $gender")
        // it is referring to gender
        println("Line 1 $it")
    }
    var value = gender!!.uppercase() // assert operator to throw error if it is null
}