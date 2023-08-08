import kotlin.math.pow
fun main() {
    println(sum(2.0,4.0))
    println(power(2.0,3.0))
    var fn:(a:Double,b:Double)->Double=::sum
    println(fn(2.0,4.0,))
    Calculator(5.0,2.0,::sum)//here is lambda function.
    Calculator(5.0,2.0,::power)//here is lambda function.
}
fun sum(a:Double,b:Double): Double {
    return a + b
}
fun power(a:Double,b:Double):Double{
    return a.pow(b)
}
fun hello(a:Int){

}
fun Calculator(a:Double,b:Double,gn:(Double,Double)->Double){
    val result=gn(a,b)
    println(result)
}
