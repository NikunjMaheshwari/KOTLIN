fun main() {
    val nums= listOf(1,2,3,4,5)
    println(isOdd(3))
    println(isOdd(2))
    val list=nums.filter(::isOdd)
    println(list)
    val userList=listOf(
        User(1,"aa"),
        User(2,"bb"),
        User(3,"cc")

    )
    println(userList.filter {it.id==2})
    val list2=nums.map { it*it }
    println(list2)

    nums.forEach{println(it)}

}
data class User(val id:Int,val name:String)
fun isOdd(a:Int):Boolean{
    return a % 2 != 0
}