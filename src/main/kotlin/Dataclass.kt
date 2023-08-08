fun main() {
    val p1=Pers(1,"john")
    val p2=Pers(1,"john")
    val p3=p1.copy(3)
    println(p1)
    println(p2)
    println(p1.hashCode())
    println(p1==p2)//p1.equals(p2)
    println(p3)
    val (id,name)=p1
    println(id)
    println(name)

}
data class Pers(val id :Int,val name:String){

}