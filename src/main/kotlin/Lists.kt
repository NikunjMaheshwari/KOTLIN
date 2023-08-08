fun main() {
    val n= mutableListOf(1,2,3)
    println(n.indexOf(3))
    println(n.contains(4))
    n[1]=0
    n.add(5)
    n.remove(3)
    println(n)
    val list2= listOf(11,12)
    n.addAll(list2)
    println(n)
    //map function
    val students= mutableMapOf<Int,String>()
    students.put(1,"ryan")
    students.put(2,"john")
    students.put(3,"Katie")
    println(students.get(1))
    students[8]="Jones"
    println(students[8])

    for ((key,value) in students){
        println("$key = $value")
    }
}