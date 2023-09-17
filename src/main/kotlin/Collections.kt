import javax.swing.text.StyledEditorKit.BoldAction

fun main() {
    var list = listOf(1, 2, 3)//immutable list no changes done in this require
    println(list[2])

    var mlist = mutableListOf(1, 2, 3)//immutable list no changes done in this require
    mlist[2] = 4
    println(mlist[2])


    var mmap = mutableMapOf<Int, String>();

    mmap.put(1, "Prathvik")
    mmap.put(2, "Akshay")
    mmap.put(3, "Alyani")

    println(mmap)

    var map = mapOf<Int, String>(1 to "Prathvik", 2 to "Akshay")
    println(map)

//filter fun is used for filter in list it's run loop for all list element and run parameter function.
    var list2 = list.filter( ::isOdd)
    println(list2)

}

fun isOdd(a: Int):Boolean{
    return a % 2 != 0
}