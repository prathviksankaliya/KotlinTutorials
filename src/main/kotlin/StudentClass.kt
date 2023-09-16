fun main() {
    var i = 10
    println(i.plus(10))

    var pathu = Student("Prathvik", 22);
    var gatu = Student("Aryan", 17);
    println(pathu.canVote())
    println(gatu.canVote())
    println(pathu)
}

class Student(var name: String, var age:Int){
    fun canVote():Boolean{
        return age >= 18;
    }
}