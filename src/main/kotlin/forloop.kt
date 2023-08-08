fun main() {
    for(i in 1..5 ){
        println(i)
    }
    for (i in 1 until  5){
        println(i)
    }
    for(i in 10 downTo 1){
        println(i)
    }
    for(i in 10 downTo 1 step 2){
        println(i)
    }
    val number=2
    for(i in 1..10){
        //println(number.toString() + " * "+ i +" = "+(number*i))

        // string templating
        println("$number x $i = ${number * i}")
    }
}