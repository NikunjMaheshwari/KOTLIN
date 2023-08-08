fun main() {
    println(C.num)
    D.test()
    var obj =object:Cloneable{
        override fun clone(){
            println("I am clone")
        }
    }
    obj.clone()
}
object C{
    val num:Int=10
}
object D{
    val p:Int =20
    fun test(){
        println("I am object B")
    }
}
interface Cloneable{
    fun clone()
}
open class Perso(val name:String){
    open fun fullName()=println("Full name $name")
}