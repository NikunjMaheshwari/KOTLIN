fun main() {
    var fn:(a:Int,b:Int)->Int=::sum
    val lambda1={x:Int,y:Int-> x+y}
    val multiLineLambda={
        println("Hello Lambda")
        val a=2+3
        "Hello"
        2
    }
    multiLineLambda()
    println(multiLineLambda() )
}
fun sum (a:Int,b:Int):Int=a+b
fun calculator(a:Int,b:Int,op:(Int,Int)->Int):Int{
    return op(a,b)
}