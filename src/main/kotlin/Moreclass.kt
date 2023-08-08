fun main() {
    var i:Int=70
    println(i.plus(30))
    println(i.toFloat())
    val p1=Personn("ram",17)
    val p2=Personn("shyam",19)
    println(p1.name)
    println(p1.canVote())
    println(p2.canVote())
}
class Personn(val name:String,var age:Int){
    fun canVote():Boolean{
        return age>18
    }
}