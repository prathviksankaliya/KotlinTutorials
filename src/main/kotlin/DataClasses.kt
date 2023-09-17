fun main() {
    val p1 = Person1(1, "Prathvik");
    val p2 = Person1(1, "Prathvik");

    println(p1 == p2)// default call equals method in back side
//    println(p1.equals(p2))
    val p3 = p1.copy(id = 3);
    println(p3)

    val (id, name) = p1;
    println("$id, $name")
}

//same like model classes in java
data class Person1(var id: Int, var name: String){

}