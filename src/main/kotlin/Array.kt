fun main() {
    var arr = arrayOf(1, 2, 3)
    var arr2 = arrayOf("One", "Two", "Three")
    println(arr2[1])
    for (i in arr) {
        println(i)
    }
    for ((i, e) in arr2.withIndex()){
        println("$i  $e")
    }
    arr2.set(0, "hello")
    println(arr2[0])
    println(arr2[1])
    println(arr2[2])
    println(arr.size)
}