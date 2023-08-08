fun main() {
    println(add(4,5))
    println(evenodd(3))
    println(printMessage(3))
    println(printMessage())
}
//it is  a function
fun add(num1: Int,num2: Int):Int  =num1+num2
fun evenodd(num:Int){
    val result = if (num % 2 == 0) "number is even" else "number is odd"
    println(result)
}
fun printMessage(count:Int=2) {
    for (i in 1..count) {
        println("Hello $i")
    }
}
