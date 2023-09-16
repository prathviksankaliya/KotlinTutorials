fun main() {
    var arr = arrayOf("one", "two", "three")
    var arr1 = arrayOf(1, 2, 3)

    println(arr[1])
    println(arr.get(2))
    println()
    for (i in arr){
        println(i)
    }

    for (i in arr.withIndex()){
        println(i)
    }

    for ((i, e) in arr.withIndex()){
        println("$i = $e")
    }

    arr.set(2, "threeeeeee")
    println(arr[2])
    println("Array size: " + arr.size)
}