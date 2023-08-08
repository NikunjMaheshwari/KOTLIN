fun main() {
    var person1=Person("A",18)
    println(person1.name)
    println(person1.age)
    var person2=Person("B",5)
    println(person2.name)
    println(person2.age)
    println(person1.canVote)
    println(person2.canVote)
}
class Person(val name:String,val age:Int) //this portion in bracket is constructor.
{
    //val name:String=name
    //val age:Int=age
    init {
        println("$name is created")
    }//init jab chalega jab is class ka object banega.
    var canVote:Boolean=age>=18
}
