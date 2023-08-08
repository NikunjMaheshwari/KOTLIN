fun main() {
    //println(addition(6,7))
    println(addition(1.0,2.0))

    //storing function in variable
    var fn =::addition
    println(fn(1.0,2.0))
}
//fun addition(a:Int,b:Int):Int{
//return a+b
//}
fun addition(a:Double,b:Double):Double{
    return a+b
}