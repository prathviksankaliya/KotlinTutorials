fun main() {
    MyClass.obj.a();
    MyClass.a();//direct access through MyClass
}
class MyClass{
//    only one companion object is allowed in class
    companion object obj{// share all info to upper class
        @JvmStatic //this is method use as a static in java so attach this annotation JvmStatic
        fun a() = println("This is obj of a method..")
    }
}