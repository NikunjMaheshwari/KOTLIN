fun main() {
    calculateTimeAndRun {
        loop(1000000)
    }
}
fun calculateTimeAndRun(fn:()->Unit){
    val start=System.currentTimeMillis()
    fn()
    val end=System.currentTimeMillis()
    println("time Taken ${end-start} ms" )

}
fun loop(n:Int){
    for(i in 1..n){

    }
}